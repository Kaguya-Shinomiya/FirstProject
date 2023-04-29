package A;

import java.math.BigInteger;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.filechooser.FileNameExtensionFilter;

import B.Mathematics;


public class KT {
    

  public static BigInteger sqrt(BigInteger x) {
    BigInteger left = BigInteger.ZERO;
    BigInteger right = x;

    while (left.compareTo(right) <= 0) {
        BigInteger mid = left.add(right).shiftRight(1);
        BigInteger square = mid.multiply(mid);

        if (square.compareTo(x) == 0) {
            return mid;
        } else if (square.compareTo(x) < 0) {
            left = mid.add(BigInteger.ONE);
        } else {
            right = mid.subtract(BigInteger.ONE);
        }
    }

    return right;
  }
    public static void main(String args[]) {

    /*outer:
        for (int i = 1; i <=2; i++) 
            
        inner:
            for (int j = 1; j <=2; j++) {
                if(j>i)
                    break;
                System.out.println(j);
            }
        
    }*/

   /*  ArrayList list = new ArrayList<>();
        // thêm các phần tử vào list
    list.add("Java");
    list.add("C++");
    list.add("PHP");
    list.add("Java");
    list.add(10);

    System.out.println(list);

    System.out.println((Integer)list.get(4)+10);*/

    /*int a=10;
    System.out.println(--a*--a);

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i++;
            i--;
        }*/
        
    } 

    
}
