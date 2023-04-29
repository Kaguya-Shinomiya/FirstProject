package A;



public class Test24 {
    public static int Test24_Arr(int m, int n, int a[]){//m là tổng, n là số phần tử
        int dem = 0;
        for (int i = 0; i <= a.length-n; i++) {
            int j=i, sum=0,j1=0;
            while(j1<n){
                sum+=a[j];
                j++;
                j1++;
            }
            if(sum==m)
                dem++;
        }
        return dem;
    }
    public static void main(String[] args)  {
        int a[]={1,3,2,1,3,5,-1,4,5};
        System.out.println(Test24_Arr(4, 2, a));//m là tổng, n là số phần tử
    
    }

}
