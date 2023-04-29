package A;

import java.util.*;
import java.security.*;

import javax.lang.model.util.ElementScanner14;

public class Test20 {
    public static void main(String[] args)  {
    /*String cell1 ="A1",cell2="D3";

    if(((int)cell1.charAt(0)+ (int)cell1.charAt(1))%2==((int)cell2.charAt(0)+ (int)cell2.charAt(1))%2){
        System.out.println("True ");
    }
    else
        System.out.println("False");*/
    

        
        /*if((((int)bishop.charAt(0)+ (int)bishop.charAt(1))%2==((int)pawn.charAt(0)+ (int)pawn.charAt(1))%2
        && (int)bishop.charAt(0) > (int)pawn.charAt(0) && (int)bishop.charAt(1) < (int)pawn.charAt(1))
        && Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0))  == Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1))){
            System.out.println("True");
        }
        
        else if((((int)bishop.charAt(0)+ (int)bishop.charAt(1))%2==((int)pawn.charAt(0)+ (int)pawn.charAt(1))%2
        && (int)bishop.charAt(0) < (int)pawn.charAt(0) && (int)bishop.charAt(1) < (int)pawn.charAt(1))
        && Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0))  == Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1))){
            System.out.println("True");
        }

        else if((((int)bishop.charAt(0)+ (int)bishop.charAt(1))%2==((int)pawn.charAt(0)+ (int)pawn.charAt(1))%2
        && (int)bishop.charAt(0) > (int)pawn.charAt(0) && (int)bishop.charAt(1) > (int)pawn.charAt(1))
        && Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0))  == Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1))){
            System.out.println("True");
        }

        else if((((int)bishop.charAt(0)+ (int)bishop.charAt(1))%2==((int)pawn.charAt(0)+ (int)pawn.charAt(1))%2
        && (int)bishop.charAt(0) < (int)pawn.charAt(0) && (int)bishop.charAt(1) > (int)pawn.charAt(1))
        && Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0))  == Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1))){
            System.out.println("True");
        }
        else
            System.out.println("False");*/


        String bishop = "A1", pawn = "H8";
        if(((int)bishop.charAt(0)+ (int)bishop.charAt(1))%2==((int)pawn.charAt(0)+ (int)pawn.charAt(1))%2
        && Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0))  == Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1))){
            
            if((int)bishop.charAt(0) > (int)pawn.charAt(0) && (int)bishop.charAt(1) < (int)pawn.charAt(1)){
                System.out.println("True");
            }
            else if((int)bishop.charAt(0) < (int)pawn.charAt(0) && (int)bishop.charAt(1) < (int)pawn.charAt(1)){
                System.out.println("True");
            }
            else if((int)bishop.charAt(0) > (int)pawn.charAt(0) && (int)bishop.charAt(1) > (int)pawn.charAt(1)){
                System.out.println("True");
            }
            else if((int)bishop.charAt(0) < (int)pawn.charAt(0) && (int)bishop.charAt(1) > (int)pawn.charAt(1)){
                System.out.println("True");
            }
            else 
                System.out.println("False");
        }
        else
            System.out.println("False");


        
    }
}
