package A;

public class Test21 {
    public static void main(String[] args)  {
        char c1;
        String s="ZZZZ",s1="";
        int k =26;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i)<= 'Z'){
                if((char)((int)s.charAt(i)+k) <= 'Z'){
                    s1=s1.concat(Character.toString((char)((int)s.charAt(i)+k)));
                }
                else{
                    
                    /*int k1=k,k2=k-;
                    //char c1=(char)((int)s.charAt(i) + ((int)'z' -s.charAt(i)));
                    k1-= (int)'Z' - s.charAt(i);
                    do{
                        //char c1 ='a';
                        if(k1 < 26){
                            c1=(char)((int)'A' + k1);
                            break;
                        }
                        else{

                        }

                    }while(/*k1 > 0);*/
                    while(true){
                        //System.out.println(12356);
                            
                    }
                    //s1=s1.concat(Character.toString(c1));
                }
            }
        }
        System.out.println(s1);
    }
}
