package A;

import B.Mathematics;

public class Test6 {
    public static boolean KTNT(double a){
        if(a < 2)
            return false;
        if(a==2)
            return true;
        for(int i =2;i<=Math.sqrt(a);i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num1 = 12, num2 = 18, gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0 && KTNT(i) ==true)
                gcd = i;
            
        }
        /*if(gcd != 1 )
            System.out.printf("UCLN cua %d va %d la: %d", num1, num2, gcd);
        else    
            System.out.println("Error");*/


        //System.out.println("\nGiai thua: "+Mathematics.factorial(50));
        String b =String.valueOf(Mathematics.factorial(50));
        System.out.println("\nGiai thua: "+b);
        for(int i=b.length()-1;i> 0;i--){
			if(b.charAt(i) != '0'){
                System.out.println(b.charAt(i));
                break;
            }
		}



        
        
        
    }
}
