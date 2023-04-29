package A;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;

import javax.accessibility.AccessibleResourceBundle;

public class Test15 {


    public static String ChuyenDoi(String s){
        char a =' ';
        ArrayList<Character> List = new ArrayList<>();
        for(int i =0; i<s.length()-1;i++){
            if(s.charAt(i+1) >= 'A' && s.charAt(i+1) <= 'Z' && s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                List.add(s.charAt(i));
                List.add(a);
            }

            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                List.add(Character.toLowerCase(s.charAt(i)));
            if(s.charAt(i+1) >= 'a' && s.charAt(i+1) <= 'z' &&s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                List.add(s.charAt(i));
            if(i==s.length()-2)
                List.add(s.charAt(s.length()-1));
        }

        char[] str1 = new char[List.size()];
        for (int i = 0; i < List.size(); i++) {
            str1[i] = List.get(i);
        }
        
        s = new String(str1);
        return s;
    }

    public static String ChuyenDoi1(String s){
        s.trim();
        String a= "";
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                a=a.concat(" "+s.substring(0, i));
                s=s.substring(i, s.length());
                i=0;
            }
            if(i >= s.length()-1 ){
                a=a.concat(" "+s.substring(0,  s.length()));
            }   
        }
        
        a=a.toLowerCase();
        return a;
    }


    public static String ChuyenDoi2(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i =1; i<sb.length();i++)
            if(Character.isUpperCase(sb.charAt(i)) && sb.charAt(i-1) != ' '){
                sb.insert(i," ");
                i++;
            }
        return sb.toString().trim();
    }

    public static String ChuyenDoi3(String s) {
        //return s.replaceAll("(?<=\\p{Ll})(?=\\p{Lu})|(?<=\\p{L})(?=\\d)", " ").toLowerCase();
        return s
        .replaceAll("(?<=\\S)((?<=\\p{Ll})(?=\\p{Lu})|(?=\\p{Lu})(?=\\p{Lu})|(?<=\\p{L})(?=\\d))", " ")
        .toLowerCase()
        .trim();
        
    }
    public static void main(String args[]) {
        
        //String a ="AbcdCD";
        //System.out.println(a.startsWith("Ab"));
       
        String s3= "ABCD";
        System.out.println("Truoc: "+s3);
        System.out.println("Sau: "+ChuyenDoi3(s3));


        String s4= " HuỳnhThanh Tuấn";
        System.out.println("Truoc: "+s4);
        System.out.println("Sau: "+ChuyenDoi3(s4));

        

        /* 
        outer:
            for (int i = 0; i < 3; i++) 
        inner:
            for(int j =0;j<3;j++){
                if(j==2)
                    continue outer;
                System.out.println("I: "+i+"\tJ: "+j);
            } */
    }
}
