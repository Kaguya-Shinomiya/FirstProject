package A;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test30 {
    

    public static void Swap(String s[], int i, int j) {
        String sTam ="";
        sTam=s[i];
        s[i]=s[j];
        s[j]=sTam;
    }

    public static void KT(String s[], String s1[], String a, String b) {
        int vt1=0,vt2=0,vt3=0,vt4=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(a))
                vt1=i;
            if(s[i].equals(b))
                vt2=i;
        }
        
        for(int i=0;i<s1.length;i++){
            if(s1[i].equals(a))
                vt3=i;
            if(s1[i].equals(b))
                vt4=i;
        }
        if((vt1 < vt2 && vt3 > vt4) || (vt1 > vt2 && vt3 < vt4)){
            System.out.println(s[vt1]+"\t"+s[vt2]+"\t"+s1[vt3]+"\t"+s1[vt4]);
            Swap(s,vt3,vt4);
        }

    }

    public static void DoiChuoiBigDecimal(String s[]) {
        String s1[] =s;
        /*for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                BigDecimal bd1 = new BigDecimal(s[i]);
                BigDecimal bd2 = new BigDecimal(s[j]);
                if(bd1.doubleValue() < bd2.doubleValue()){
                    Swap(s,i,j);
                }
            }
        }*/

        //C1
        List <String> a = new ArrayList<>();
        Collections.addAll(a, s);
        //System.out.println(a);
        //C1
        Collections.sort(a,(o1,o2) -> new BigDecimal(o2).compareTo(new BigDecimal(o1)));

        //C2
        Collections.sort(a, Comparator.comparing(i -> new BigDecimal(String.valueOf(i))).reversed());
        System.out.println(a);

        //s = a.toArray(new String[0]);

        //System.out.println(Arrays.toString(s));
        //Arrays.sort(s);
        //System.out.println(Arrays.toString(s));

        
    }


    public static void main(String[] args) {
        String s[]={"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
        //BigDecimal bd = new BigDecimal(0000.0000);
        //System.out.println(s.toString());
        System.out.println(Arrays.toString(s));
        System.out.println("--------------------------------");
        DoiChuoiBigDecimal(s);
        //System.out.println(Arrays.toString(s));


        /*BigDecimal bd1 = new BigDecimal(0.12);
        BigDecimal bd2 = new BigDecimal(.12);

        System.out.println(bd1);
        System.out.println(bd2);*/

        double d = .12;
        System.out.println(d);
    }
}
