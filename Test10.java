package A;

import java.util.LinkedList;
/* 
public class Test10 {
    public static void main(String args[]) {
        String a = "abcde", b = "abcde";
        
        int dem = 0;
        a.trim();
        b.trim();

        System.out.println("a: "+a+"\tb: "+b + "\tSo sanh: "+a.equals(b));
        LinkedList<Character> list = new LinkedList<Character>();

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<a.length();i++){
            list.add(i,a.charAt(i));
        }

        for(int i=0;i<a.length();i++){
            if(list.get(i) != b.charAt(i)){
                dem++;
                list.add(i,b.charAt(i));
 
                for(int j=0;j<a.length();j++){                    
                    if(list.get(j) != b.charAt(j)){
                        list.remove(j);
                        break;
                    }
                }
            }
        }
        if(list.size() != b.length())
            list.remove(list.size()-1);

        char[] str1 = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str1[i] = list.get(i);
        }

        a = new String(str1);

        System.out.println("So lan hoan doi: "+dem);
        System.out.println("a: "+a+"\tb: "+b + "\tSo sanh: "+a.equals(b));

        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime1 + "ms");

        
    }
}*/


public class Test10 {

    public static int SwapSwap(String a, String b)
    {
        int dem = 0;
        a.trim();
        b.trim();

        System.out.println("a: "+a+"\tb: "+b + "\tSo sanh: "+a.equals(b));
        LinkedList<Character> list = new LinkedList<Character>();

        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<a.length();i++){
            list.add(i,a.charAt(i));
        }

        for(int i=0;i<a.length();i++){
            if(list.get(i) != b.charAt(i)){
                dem++;
                list.add(i,b.charAt(i));
 
                for(int j=0;j<a.length();j++){                    
                    if(list.get(j) != b.charAt(j)){
                        list.remove(j);
                        break;
                    }
                }
            }
        }
        if(list.size() != b.length())
            list.remove(list.size()-1);

        char[] str1 = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str1[i] = list.get(i);
        }

        a = new String(str1);

        System.out.println("So lan hoan doi: "+dem);
        System.out.println("a: "+a+"\tb: "+b + "\tSo sanh: "+a.equals(b));

        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime1 + "ms");

        return(a.equals(b)==true)?1:-1;
    }
    public static void main(String args[]) {
        String a = "aabc", b = "abka";
        System.out.println(SwapSwap(a, b));
        

    }
}
