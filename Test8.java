package A;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.*;

public class Test8 {
    public static void main(String args[]) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String a;
        /*System.out.println("Nhap chuoi a: ");
        a =sc.nextLine();
        //
        a=a.trim();
        a=a.toLowerCase();
        System.out.println(a);
        for(int i=0;i< a.length();i++){
			if(i==0 || (int)a.charAt(i-1)==32 ){
                a= a.replace(a.charAt(i), Character.toUpperCase(a.charAt(i)));
                //System.out.println(Character.toUpperCase(a.charAt(i)));
            }
            if(i != 0 && (int)a.charAt(i-1)!=32 ){
                a= a.replace(a.charAt(i), Character.toLowerCase(a.charAt(i)));
            }
		}
        System.out.println("Chuoi sau chinh sua: "+a);


        String s1 = "kieu nguyen thanh binh";
        System.out.println(s1=s1.replace('n', 'N'));*/



        /*String str = "kieu nguyen thanh binh";
        String[] words = str.split("\\s"); // Tách chuỗi thành các từ riêng biệt
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) { // Kiểm tra từ có rỗng hay không
                char firstChar = word.charAt(0);
                if (Character.isLowerCase(firstChar)) { // Kiểm tra ký tự đầu tiên của từ là chữ thường
                    firstChar = Character.toUpperCase(firstChar); // Chuyển đổi chữ cái đầu tiên thành chữ hoa
                    word = firstChar + word.substring(1); // Kết hợp chữ cái đầu tiên hoa với phần còn lại của từ
                }
            sb.append(word).append(" "); // Nối từ mới với kết quả cuối cùng
            }
        }
        String result = sb.toString().trim(); // Loại bỏ khoảng trắng dư thừa ở cuối
        System.out.println(result); // Output: Kieu Nguyen Thanh Binh*/




        //////////////////////////////////


        /*String b = "binh";
        String c=null,d,e;
        b=b.trim();
        b=b.toLowerCase();

                /*if(b.indexOf(" ") ==1)
                    d=b.substring(0, b.indexOf(" "));
                else
                    d=b.substring(0,b.length());
                //System.out.println(b.length());
                //System.out.println(b.substring(0,b.length()));
                
                b=b.substring(0,b.length());
                //System.out.println(b);
                e=d.substring(0,1);
                //System.out.println(e);
                if(c==null)
                    c = d.replaceFirst(e, e.toUpperCase()) + " ";
                else
                    c = c.concat(d.replaceFirst(e, e.toUpperCase()) + " ");
         
        while(b!= null){
            b=b.trim();
            
            if(b.length() != 0){
                //System.out.println(b.length());
                if(b.indexOf(" ") ==1)
                    d=b.substring(0, b.indexOf(" "));
                else
                    d=b.substring(0,b.length());
                b=b.substring(0,b.length());
                //System.out.println(b);
                e=d.substring(0,1);
                //System.out.println(e);
                if(c==null)
                    c = d.replaceFirst(e, e.toUpperCase()) + " ";
                else
                    c = c.concat(d.replaceFirst(e, e.toUpperCase()) + " ");
            }
            else
                b=null;
        }

        System.out.println(c);*/




        long startTime1 = System.currentTimeMillis();
        String str ="kIEu ngUyEN tHAnH bInH";
        str.trim();
        str = str.toLowerCase();
        ArrayList<Character> STR = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(i==0 || (int)str.charAt(i-1)==32 )
                STR.add(Character.toUpperCase(str.charAt(i)));
            else
                STR.add(str.charAt(i));
        }
        char[] str1 = new char[STR.size()];
        for (int i = 0; i < STR.size(); i++) {
            str1[i] = STR.get(i);
        }
        
        str = new String(str1);
        
        System.out.println(str);
        
        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime1 + "ms");
        
        /* 
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        // cách 1
        String str4 = new String(ch);
        System.out.println(str4);
        // cách 2
        String str5 = String.valueOf(ch);
        System.out.println(str5);*/





        //System.out.println(str);


        /* 
        a.trim();
        for(int i=0;i< a.length();i++){
			if((int)a.charAt(i) >= 97  && (int)a.charAt(i) <= 122 && (i==0 || (int)a.charAt(i-1)==32) ){
                a= a.replace(a.charAt(i), Character.toUpperCase(a.charAt(i)));
                //System.out.println(a);
            }
            if(i != 0 && (int)a.charAt(i-1)!=32 && (int)a.charAt(i) >= 65  && (int)a.charAt(i) <= 90){
                a= a.replace(a.charAt(i), Character.toUpperCase(a.charAt(i)));
            }
		}
        System.out.println("Chuoi sau chinh sua: "+a);*/
        
        //C1
        /*for(int i=0;i< a.length();i++){
			if((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57){
                a=a.replace(a.charAt(i)+"","");
            }
		}
        //C2
        for(char c = '0';c<='9';c++){
            a=a.replace(""+c,"");
        }
        System.out.println(a);

        /*a="ab1c";
        String b =a.replaceAll("1", "d");
        System.out.println(b);
        
        String s1;// = "My name is Khan. My name is Bob. My name is Sonoo.";
        s1 = sc.nextLine();
        String replaceString = s1.replaceAll("is", "was"); // thay the tat ca cac chuoi "is" thanh "was"
        System.out.println(replaceString);*/

        String s = "kIỀu ngUyỄN tHAnH bÌnH";
        //s = s.trim().toLowerCase().replaceAll("(?<=^|\\s)\\p{L}", match -> match.toUpperCase());

        s = Pattern.compile("(?<=\\s|^)\\p{L}+(?=\\s|$)")
            .matcher(s)
            .replaceAll(match -> match.group()
            .substring(0, 1)
            .toUpperCase() + match.group()
            .substring(1).toLowerCase());
        System.out.println(s);  
    }
}
