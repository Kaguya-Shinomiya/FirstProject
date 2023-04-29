package A;

import java.util.*;

public class Test19 {
    public static void main(String[] args)  {
        int arr[]={63,25,73,1,98,73,56,84,86,57,16,83,8,25,81,56,9,53,98,67,99,12,83,89,80,91,39,
            86,76,85,74,39,25,90,59,10,94,32,44,3,89,30,27,79,46,96,27,32,18,21,92,69,81,40,40,34,
            68,78,24,87,42,69,23,41,78,22,6,90,99,89,50,30,20,1,43,3,70,95,33,46,44,9,69,48,33,60,65, 16, 
            82 ,67 ,61 ,32 ,21 ,79, 75, 75, 13, 87, 70, 33};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int maxleght =1;
        ArrayList <Integer> arr1, arr2;
        arr1 =new ArrayList<>();
        arr2 =new ArrayList<>();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            int m=Integer.MAX_VALUE, b=0, flag=0, arrlength=1,pttt;
            //maxlenght lưu giá trị độ dài cấp số cộng lon nhat của mảng
            //m giá trị trước phần tử cấp số cộng tiếp theo;
            //b cấp số cộng
            //flag cờ hiệu
            //arrlenght lưu giá trị độ dài cấp số cộng của mảng
            //ptt gia tri phần tử của cấp số cộng kế tiếp
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[j+1] != arr[j] && arr[j] != arr[i]){
                    pttt=arr[j];
                    if(flag == 0){
                        b= arr[j]-arr[i];
                        flag=1;
                        arr1 =new ArrayList<>();
                        m=arr[i];
                        arr1.add(m);
                    }     
                    
                    if(pttt-m==b){
                        arr1.add(arr[j]);
                        m=pttt;
                        arrlength++;
                    }
                }
            }

            if(maxleght < arrlength){
                arr2 =new ArrayList<>();
                arr2.addAll(arr1);
                maxleght = arrlength;
                
            }
        }
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.println("Chuoi cap so cong lon nhat: "+arr2);

        
        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime1 + " ms");


    }
}
