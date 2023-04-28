package A;

public class Test26 {

    public static int[][] MaTran(int n) {
		n *= 2;
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = (int) (Math.random() * 10);
		return arr;
	}

    public static void Output(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("\t"+a[i][j]);
            }
        System.out.println();
        }
    }


    public static void SwapDong(int [][] arr,int k){
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp = arr[k][i];
			arr[k][i] = arr[k][n-i-1];
			arr[k][n-i-1] = temp;
		}
	}
	
	public static void SwapCot(int [][] arr,int k){
		int n = arr.length;
		for(int i=0;i<n/2;i++) {
			int temp = arr[i][k];
			arr[i][k] = arr[n-i-1][k];
			arr[n-i-1][k] = temp;
		}
	}


    public static void SwapDong1(int [][] a){
		for (int i = 0; i < a.length; i++) {
            int sum1=0;
            int sum2=0;
            for (int j = 0; j < a.length/2; j++) {
                sum1+= a[i][j];
                sum2+=a[i][a.length-1-j];
                
            }
            if(sum1<sum2){
                SwapDong(a,i);
            }
        }
	}
	
	public static void SwapCot1(int [][] a){
		for (int i = 0; i < a.length; i++) {
            int sum3=0;
            int sum4=0;
            for (int j = 0; j < a.length/2; j++) {
                sum3+=a[j][i];
                sum4+=a[a.length-1-j][i];
            }
            if(sum3<sum4){
                SwapCot(a,i);
            }
        }
	}

    public static void MaxMaTran(int [][] a) {
		for (int i = 0; i < 2; i++) {
            SwapCot1(a);
            SwapDong1(a);
        }
	}



    public static int sum(int[][] arr) {
		int n=arr.length,sum=0;
		for(int i=0;i<n/2;i++)
			for(int j=0;j<n/2;j++)
				sum+=arr[i][j];
		return sum;
	}

    public static void main(String[] args)  {
        //int a[][] = {{44,23,65,59,44,85},{50,46,20,30,1,95},{71,87,11,6,81,76},{38,14,89,15,5,99},{35,34,23,54,49,31},{1,69,48,78,40,91}};
        
        //int a[][] = {{1,2,3,4},{4,5,6,4},{9,-2,-3,-8},{5,5,5,5}};

        
        int [][] a  = MaTran(4);

        //int b[][]={{9,3,3,1},{8,3,4,6},{9,0,0,8},{1,6,2,8}};
        int b[][]=MaTran(4);
        Output(b);
    


        System.out.println("Sau khi SWAP");
        MaxMaTran(b);
        Output(b);
        System.out.println(sum(b));
    }
}
