package A;



import java.util.HashSet;
import java.util.Arrays;

import B.Mathematics;
public class Test12 {
    public static void main(String args[]) {
        HashSet<Integer> setA = new HashSet<Integer>();
        int []a= {10, 100, 80, 75, 15};
        var num = 1;
        System.out.println(Arrays.toString(a));
        for(int i = 1;i<a.length-1;i++){
            setA.add(Mathematics.GCD(a[0], a[i+1]));
        }

        int[] arr = new int[setA.size()];
        int i = 0,flag = 1;
        for (int num1 : setA) {
            arr[i++] = num1;
        }
        for(i = 0;i<arr.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]% arr[i]==0){
                    num=arr[i];
                    if(flag==1)
                        flag=num;
                }
                if(a[j]% arr[i]!=0){
                    num=flag;
                    continue;
                }
            }
        }

        if(num !=0)
            System.out.println("UCLN: "+num);
    }
    
}
