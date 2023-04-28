package A;

import java.util.ArrayList;

public class Test9 {
    public static void main(String args[]) {
        long startTime1 = System.currentTimeMillis();
        String str ="adcadckacdabbb";
        str.trim();
        System.out.println(str);
        
        ArrayList<Character> STR = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            STR.add(str.charAt(i));
            
        }
        for (int i = 0; i < STR.size()-1; i++) {
            int count =1;
            for(int j=i+1;j<STR.size(); j++){
                if(STR.get(i) ==STR.get(j))
                    count++;
            }
            if(count != 1)
                System.out.println(STR.get(i)+":" + count);

            for(int j=i+1;j<STR.size(); j++){
                if(STR.get(i) ==STR.get(j)){
                    STR.remove(j);
                }
            }
        }

        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime1 + " ms");

    }
}
