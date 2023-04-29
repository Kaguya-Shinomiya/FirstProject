package A;


import java.util.*;
public class Test3 {


    public static boolean KTNT(int a){
        if(a < 2)
            return false;
        if(a==2)
            return true;
        for(int i =2;i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public static int US(int i){
        int dem=0;
        for(int j = 2; j<i;j++)
            if(i%j==0 && KTNT(j) ==true)
                dem++;
        return dem;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,k, dem=0;


        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap k: ");
        k = sc.nextInt();



        long startTime1 = System.currentTimeMillis();

        for(int i = a; i<b+1;i++){
            //dem = 0;
            /*for(int j = 2; j<i;j++)
                if(i%j==0 && KTNT(j) ==true)
                    dem++;*/
            if(US(i)==k){
                //System.out.print("\t"+i);
                dem++;
            }   
        }

        System.out.println("\nSo luong so thoa man tu "+a +" den " +b +" la: "+dem);

        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("\nThoi gian thuc thi chuong trinh: " + elapsedTime1 + "ms");
    }
}