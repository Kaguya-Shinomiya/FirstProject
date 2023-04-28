package A;

import java.util.*;


public class Test4 {

    

    

    public static boolean Kangaroo(int x1,int v1, int x2, int v2){
        if(x1 < x2 && v1 <= v2)
            return false;
        
        return true;
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x1,v1,x2,v2;


        System.out.println("Nhap x1: ");
        x1 = sc.nextInt();
        System.out.println("Nhap v1: ");
        v1 = sc.nextInt();
        System.out.println("Nhap x2: ");
        x2 = sc.nextInt();
        System.out.println("Nhap v2: ");
        v2 = sc.nextInt();

        long startTime1 = System.currentTimeMillis();

        System.out.println(Kangaroo( x1, v1,  x2,  v2));

        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        //System.out.println(Kangaroo( x1, v1,  x2,  v2));
        System.out.println("\nThoi gian thuc thi chuong trinh: " + elapsedTime1 + "ms");

        
        
    } 
}
