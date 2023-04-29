package A;

import java.util.*;

public class Test16 {
    public static void main(String args[]){
        //ArrayList<Integer> ds = new ArrayList<>();
        int arr[]={63,25,73,1,98,73,56,84,86,57,16,83,8,25,81,56,9,53,98,67,99,12,83,89,80,91,39,86,76,85,74,39,25,90,59,10,94,32,44,3,89,30,27,79,46,96,27,32,18,21,92,69,81,40,40,34,68,78,24,87,42,69,23,41,78,22,6,90,99,89,50,30,20,1,43,3,70,95,33,46,44,9,69,48,33,60,65 ,16 ,82 ,67 ,61 ,32 ,21 ,79, 75, 75, 13, 87, 70, 33  };
        List ans = Arrays.asList(new Integer[arr.length]);
        System.out.println(arr.length);
        Arrays.sort(arr);
        int dem=0;
        for(int a : arr){
            if(ans.get(a)==null){
                ans.set(a, 1);
                
            }
            else{
                dem = (int)ans.get(a);
                dem++;
                ans.set(a, dem);
            }
        }
        //System.out.println(Arrays.toString(arr));
        List ans1 = Arrays.asList(new Integer[arr.length]);
        for(int i=0;i< arr.length;i++){
            dem=0;
            for(int j=0;j<arr.length;j++){
                if(i == arr[j]){
                    dem++;
                }
                ans1.set(i, dem);

            }
        }

        System.out.println(ans);
        System.out.println(ans1);
    }
}
