package A;


import java.math.*;
import java.util.*;


/* 
import java.text.*;
import java.awt.event.*;
import java.awt.image.*;
import java.net.http.*;
import java.nio.file.*;
import java.rmi.*;
import java.awt.*;
import java.beans.*;
import java.lang.annotation.*;
import java.applet.*;*/


import B.Mathematics;

public class Test22 {

    public static boolean TestArr(int a[], int kt){
        for (int i = 0; i < a.length; i++) {
            if(kt % a[i] != 0){
                return false;
            }
            
        }
        return true;
    }



    public static BigInteger TichMang(int a[]){
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 0; i < a.length; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(a[i]));
        }
        return factorial;
    }


    public static List BoiSoCuaMang(int a[]){

        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.sort(a);

        for(int i = a[a.length-1]; i <=  TichMang(a).doubleValue(); i++){
            if(TestArr(a, i)==true){
                ds.add(i);
            }
        }
        return ds;
    }

    public static void FinalTest(int a[],int b[]){
        System.out.printf("So giua mang la: ");
        
        ArrayList<Integer> ds = new ArrayList<>();

        
        ds.addAll(BoiSoCuaMang(a));

        int dem=0;
        for(int i=0;i < ds.size();i++){
            for (int j = 0; j < b.length; j++) {
                dem =0;
                if(b[j] % ds.get(i) == 0)
                    dem++;      
            }
            if(dem == b.length-1)
                System.out.printf("%5d",ds.get(i));
        }
        
    }

    public static void main(String[] args)  {
        int a[] = {1}, b[]={48,72};

        //System.out.println(TichMang(a));

        //System.out.println(BoiSoCuaMang(a));
        System.out.println("A[]: "+Arrays.toString(a));
        System.out.println("B[]: "+Arrays.toString(b));

        FinalTest(a,b);

        int k = (int)(Mathematics.random()*10);
        System.out.println("\n\n"+k);

    }
}
