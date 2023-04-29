package A;

import java.util.ArrayList;
import java.util.Random;

//import java.util.HashMap;
//import java.util.Map;

public class Test13 {
    
        /*Map<String, Integer> Luot = new HashMap<>();
        int n=15, flag=0;
        Luot.put("John", 0);
        Luot.put("Mary", 0);
        for(int i=n;i>0;){
            if(i>5){
                if(flag==0)
                    Luot.setL
            }
        }*/
        //int n=15;
        //int a[n][n];


        /*ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        
        AArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        outerList.add(innerList1);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(3);
        innerList2.add(4);
        outerList.add(innerList2);

        ArrayList<Integer> element = outerList.get(0); // lấy phần tử thứ hai trong ArrayList con đầu tiên
        System.out.println(element); // kết quả sẽ là 2*/

        /*******************************/
        
        public static String TroChoi(int n) {
            if (n == 2 || n == 3 || n == 4 || n == 5)
                return "Ngoc";
            int tong = 0;
            int dem = 0;
            while (tong < n-1) {
                Random rand = new Random();
                int ranNum = rand.nextInt(4) + 2;
                if (ranNum != 4) {
                    tong += ranNum;
                    dem++;
                }
                if (tong > n) {
                    if (ranNum != 4) {
                        tong -= ranNum;
                        dem--;
                    }
                }
            }
            return (dem % 2 == 0) ? "Phong" : "Ngoc";
        }
    public static void main(String args[]) {
        System.out.println(TroChoi(10));


        int n = 15, que = 5;// số lượng que diêm
        //Mỗi lần rút được 2 hoặc 3 hoặc 5 que
        //Ngọc vs Phong và Ngoc luôn đi trước => Ngoc dự đoán các bước đi của Ngoc là số lẻ và số chẳn trong mảng
        ArrayList<ArrayList<Integer>> Ngoc = new ArrayList<>(); //mảng các TH
        ArrayList<ArrayList<Integer>> TH = new ArrayList<>(); //TH(1),Th(2), ..., TH(n)


        /**12 que
         * 5,5,2
         * 5,3,3
         * 5,3,2,2
         * 5,2,3,2
         * 5,2,2,3
         */


        /** 10 que
         * 5,5 => Thua
         * 5,3,2
         * 5,2,3
         * 3,5,2
         * 3,2,5
         * 3,3,2,2 =>Thua
         * 3,2,3,2 =>Thua
         * 3,2,2,3 =>Thua
         * 3,3,3
         * 3,2,2,2
         * 2,5,3
         * 2,5,2
         * 2,3,5
         * 2,3,3,2 =>Thua
         * 2,3,2,3 =>Thua
         * 2,3,2,2 =>Thua
         * 2,2,3,2 =>Thua
         * 2,2,2,3 =>Thua
         * 2,2,2,2,2
         */

        /**8 que 
         * 5,3 =>Thua
         * 5,2 =>Thua
         * 3,5 => Thua
         * 3,3,2
         * 3,2,3
         * 3,2,2
         * 2,5 => Thua
         * 2,3,2
         * 2,2,3
         * 2,2,2,2 => Thua
         * 
         */

        /**7 que
         * 5,2
         * 3,3
         * 3,2,2
         */

        /** 6 que
         * 5
         * 3,3
         * 3,2
         */

         
        /*int dem5 = 0; // TH ra 5
        for(int i=6;i<=n;i++){
            if(i%2==0)
                dem5++;
        }

        int dem3=0;
        for(int i=6;i<=n;i++){
            if(i%2==0)
                dem3++;
        }*/

        /*for(int i=0;i<n*2;i++){
            for(int j = 0;j< n- que;j++){// 8 - 5 = 3
                if(i==0 ){

                }
            }
        }*/
        

    }
}
