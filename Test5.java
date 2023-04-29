package A;

import java.nio.charset.Charset;
import java.util.*;

public class Test5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Nhap chuoi a: ");
        a =sc.nextLine();
        //C1
        /*for(int i=0;i< a.length();i++){
			if((int)a.charAt(i) >= 48 && (int)a.charAt(i) <= 57){
                a=a.replace(a.charAt(i)+"","");
            }
		}*/
        //C2
        for(char c = '0';c<='9';c++){
            a=a.replace(""+c,"");
        }
        System.out.println(a);

        a="ab1c";
        String b =a.replaceAll("1", "d");
        System.out.println(b);
        
        /*String s1;// = "My name is Khan. My name is Bob. My name is Sonoo.";
        s1 = sc.nextLine();
        String replaceString = s1.replaceAll("is", "was"); // thay the tat ca cac chuoi "is" thanh "was"
        System.out.println(replaceString);*/

        String s ="X";
        int k = 5;
        char arr[] = s.toCharArray();
        char temp;
        k=k%26;
        for(int i=0;i<s.length();i++){
           if(arr[i]>='a'&&arr[i]<='z'){
                temp = arr[i];
                temp+=k;
                if(temp>'z'){
                    temp-=26;
                }
                    arr[i] = temp;
           }
           if(arr[i]>='A'&&arr[i]<='Z'){
                temp = arr[i];
                temp+=k;
                if(temp>'Z'){
                    temp-=26;
                }
                    arr[i] = temp;
           }
        }
        String s1 = new String(arr);
        System.out.println(s1);
    }
}
