package A;


public class Test25 {


    public static void Output(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("\t"+a[i][j]);
            }
        System.out.println();
        }
    }

    public static int TongLine(int m, int n, int a[][], int d){//m điểm bắt đầu, n là số phần tử, d là dòng 
        int sum=0;
        for (int i = 0; i < n; i++) {//n=5 => m=2,3,4,5,6
            sum+=a[d][m+i];
        }
        return sum;
    }


    public static int TongMatrix(int a[][]) {
        int max= Integer.MIN_VALUE, k=2;
        //max là giá trị lớn nhất của n*n
        //k là kích thước n*n
            for (int z = 0; z < a.length-1; z++) { // Duyệt 1*1 , 2*2, ...n*n(số lần của n*n)
                for (int i = 0; i < a.length-k+1; i++) {
                    int max1=0;
                    for (int j = 0; j < k; j++) {
                        max1+= TongLine(i, k, a, j);//i điểm bắt đầu, k là số phần tử, j là dòng 
                        //System.out.println("i: "+i+" k: "+k+" j: "+j);
                    }
                    //System.out.println(max1);
                    if(max1 > max)
                        max=max1;
                        
                }

                if(k!= a.length-1)
                    k++;
            }
        return max;
    }


    /*public static void SumMaxMatrix(int a[][]) {
        int b[][]=a;
        int MaxKhongDoi=TongMatrix(a);
        int MaxDoiDong=0, dong=-1;
        int MaxDoiCot=0, cot=-1;
        for (int i = 0; i < a.length; i++) {
            
            for(int j = 0; j<a.length/2;j++){
                int tam;
                tam=a[i][j];
                a[i][j]=a[i][a.length-1-j];
                a[i][a.length-1-j]=tam;
            }
            if(TongMatrix(a) > MaxKhongDoi){
                MaxDoiDong=TongMatrix(a);
                dong=i;
                //System.out.println("Doi");
                //Output(a);
            }
            a=b;
        }

        Output(b);
        for (int i = 0; i < a.length; i++) {
            a=b;
            //System.out.println("Doi");
            
            for(int j = 0; j<a.length/2;j++){
                int tam;
                tam=a[j][i];
                a[j][i]=a[a.length-1-j][i];
                a[a.length-1-j][i]=tam;
                /*System.out.println("Doi");
                Output(a);*/



                //int tam;
                /*tam=a[i][1];
                a[i][1]=a[a.length-1-i][1];
                a[a.length-1-i][1]=tam;
            }
            if(TongMatrix(a) > MaxKhongDoi){
                MaxDoiCot=TongMatrix(a);
                cot=i;
                
            }
        }

        if(dong !=-1)
            System.out.println("Doi dong "+dong +" de duoc tong ma tran con lon nhat: "+MaxDoiDong);
        else if(cot != -1)
            System.out.println("Doi cot "+cot +" de duoc tong ma tran con lon nhat: "+MaxDoiCot);
        else 
            System.out.println("Khong can phai doi dong hoac cot de duoc tong ma tran con lon nhat: "+MaxKhongDoi);
    }*/

    public static void main(String[] args)  {
        //int a[][] = {{44,23,65,59,44,85},{50,46,20,30,1,95},{71,87,11,6,81,76},{38,14,89,15,5,99},{35,34,23,54,49,31},{1,69,48,78,40,91}};
        
        int a[][] = {{1,2,3,4},{4,5,6,4},{9,-2,-3,-8},{5,5,5,5}};
        Output(a);
    
        //Đảo 1 dòng
        /*for(int i = 0; i<a.length/2;i++){
            int tam;
            tam=a[1][i];
            a[1][i]=a[1][a.length-1-i];
            a[1][a.length-1-i]=tam;
        }*/

        //System.out.println("\t\t\tDAO 1 DONG( DONG 1)");
        //Output(a);
    
        //System.out.println(TongLine(0, 3, a, 0));
        //System.out.println(TongMatrix(a));



        //Đảo 1 cột
        /*for(int i = 0; i<a.length/2;i++){
            int tam;
            tam=a[i][1];
            a[i][1]=a[a.length-1-i][1];
            a[a.length-1-i][1]=tam;
        }*/

        //Output(a);

        //SumMaxMatrix(a);

    }
}
