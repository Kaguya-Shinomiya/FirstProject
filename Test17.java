package A;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */



public class Test17 {
    public static void main(String[] args) throws IOException {
        int flag=0;
        String s = "12:45:54PM";
        String s1 = new String();
        s1 = s.substring(s.length()-2, s.length());
        if(s1.equals("AM")){
            int i = Integer.valueOf(s.substring(0, 2));
            if(i >= 12){
                i -=12;
                if(i < 12)
                    s1="0";
                else
                    s1=" ";

                s1 =s1.concat(String.valueOf(i)) + s.substring(2,s.length()-2);
                flag=1;
            }
            if(flag==0)
                s1 =s.substring(0,s.length()-2);
        }
        if(s1.equals("PM")){
            int i = Integer.valueOf(s.substring(0, 2));
            if(i < 12 ){
                i +=12;
                s1=" ";
                s1 =s1.concat(String.valueOf(i)) + s.substring(2,s.length()-2);
                flag=1;
            }
        }
        if(flag==0)
            s1 =s.substring(0,s.length()-2);
        System.out.println(s1.trim());
    }
}