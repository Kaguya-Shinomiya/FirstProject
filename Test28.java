package A;



public class Test28 {

    /*public static String TestString(String s) {
        //int vt=0;
        StringBuilder sb = new StringBuilder(s);

        while(sb.reverse().toString().equals(sb.reverse().toString())==false){
            for(int i=0;i<sb.length();i++){
                if(sb.reverse().charAt(i) != sb.reverse().charAt(i)){    
                    sb.reverse().toString();    
                    /*for(int j = 0;j<s.length();j++){
                        if(s.charAt(j)==sb.toString().charAt(i)){
                            System.out.println(s.charAt(j) + "\t"+sb.toString().charAt(i));
                            sb.deleteCharAt(i);
                            vt=j;
                            break;
                        }
                    }
                    sb.deleteCharAt(i);
                    //vt=i;
                }
            }
        }
        return sb.toString();
    }*/

    public static String TestString(String s) {
        StringBuilder sb = new StringBuilder(s);

        while(!sb.reverse().toString().equals(sb.reverse().toString())){
            for(int i=0;i<sb.length();i++){
                if(sb.reverse().charAt(i) != sb.reverse().charAt(i)){    
                    sb.reverse().toString();    
                    sb.deleteCharAt(i);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println("Lê Quang Bảo");

        //System.out.println(System.getProperty("java.version"));

        //System.out.println(System.getProperty("java.vendor"));

        //System.gc();

        String s ="abaac";
        System.out.println(s);
        
        System.out.println(TestString(s));

    }
}
