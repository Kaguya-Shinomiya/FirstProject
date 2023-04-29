package A;

import java.util.*;

import javax.annotation.processing.Messager;

import B.Mathematics;

public class Matrix {

    static int d,c;
    

    public static int[][] NhapMaTran(int d,int c) {
		int[][] arr = new int[d][c];
		for (int i = 0; i < d; i++)
			for (int j = 0; j < c; j++)
				arr[i][j] = (int) (Math.random() * 5);
		return arr;
	}

    public static void xuatMT(int a[][], int d, int c){
        System.out.printf("\n");
        for (int i = 0; i < d; i++){
            for (int j = 0; j < c; j++)
                System.out.printf("%5d", a[i][j]);
            System.out.printf("\n");
        }
    }
    //
    public static void CD(int a[][],int c ,int d, int vt){
        int vt1,vt2,flag=0;
        vt2 = vt1 =vt;
        for(int i = 0; i < d; i++)
            if(a[vt][vt] == 0){
                if (a[vt1][vt] != 0){
                    System.out.printf("\nDao dong %d va %d ", vt + 1, vt1 + 1);
                    System.out.printf("\n------------------->\n");
                        for (int j = vt; j < c; j++){
                            int step = a[vt][vt2];
                            a[vt][vt2] = a[vt1][vt2];
                            a[vt1][vt2] = step;
                            vt2++;
                            flag=1;
                        }
                }
                else if(vt1<d-1)
                    vt1++;
            }
        if(flag==1)
            xuatMT(a, d, c);
    }
    //
    static void matrix(int a[][], int d, int c){
        int x, y, g = 0, w = 1, flag = 0;
        CD(a,c ,d, 0);
        for (int h = 0; h < d; h++){
            if (a[g][g] == 0 && g == 0){
                g++;
                w++;
            }
            if (a[g][g] != 0){  
                for (int i = w; i < d;){
                    if (a[i][g] != 0){
                        x = Mathematics.abs(Mathematics.LCM(a[g][g], a[i][g]) / a[g][g]);
                        y = Mathematics.abs(Mathematics.LCM(a[g][g], a[i][g]) / a[i][g]);
                        for (int j = 0; j < c; j++){
                            if ((a[g][g] > 0 && a[i][g] < 0) || (a[g][g] < 0 && a[i][g] > 0)){
                                if (flag == 0){
                                    System.out.printf("\n%d dong %d + %d dong %d", x, g + 1, y, i + 1);
                                    System.out.printf("\n------------------->\n");
                                    flag=1;
                                }
                                a[i][j] = (a[g][j] * x) + (a[i][j] * y);
                            }
                            else{
                                if (flag == 0){
                                    System.out.printf("\n%d dong %d - %d dong %d", x, g + 1, y, i + 1);
                                    System.out.printf("\n------------------->\n");
                                    flag=1;
                                }
                                a[i][j] = (a[g][j] * x) - (a[i][j] * y);
                            }
                        }
                        xuatMT(a, d, c);
                        flag=0;
                    }
                    else
                        i++;
                }
                g++;
                w++;
            }
            else
                CD(a,c ,d, g);
        }
    }
    //
    public static void dD(int a[][], int c1, int c, int d, int d1, int d2){
        for (int i = c1; i < c; i++){
            int step = a[d1][i];
            a[d1][i] = a[d2][i];
            a[d2][i] = step;
        }
    }
    //
    public static void cZ(int a[][], int d, int c,List<Integer> b1){
        for (int i = 0; i < d; i++){
            int count = 0, tong = 0;
            for (int j = 0; j < c; j++){
                tong += a[i][j];
                if (tong == 0)
                    count++;
                if (tong != 0 || j == c - 1){
                    b1.add(count);
                    break;
                }
            }
        }
    }
    //
    public static void sL(int a[][], int d, int c, List<Integer> b1){
        for (int i = 0; i < b1.size() - 1; i++)
            for (int j = i + 1; j < b1.size(); j++)
                if (b1.get(i) > b1.get(j)){
                    dD(a, 0, c, d, i, j);
                    System.out.printf("\nDao dong %d va %d ", i + 1, j + 1);
                    System.out.printf("\n------------------->\n");
                    int step = b1.get(i);
                    b1.set(i, b1.get(j));
                    b1.set(j, step);
                    xuatMT(a, d, c);
                }
                
    }
    //
    public static void MR(List<Integer> b1, int c, int d){
        int dem = 0;
        for (int i = b1.size()-1; i >= 0; i--)
            if (b1.get(i) == c)
                dem++;
            System.out.printf("\nR[%d]", d - dem);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("Nhap dong: ");
            d=sc.nextInt();
            if (d == 0)
                System.out.printf("\nVui long nhap lai dong > 0\n");
        } while (d <= 0);
        do{
            System.out.printf("Nhap cot: ");
            c=sc.nextInt();
            if (c == 0)
                System.out.printf("\nVui long nhap lai cot > 0\n");
        } while (c <= 0);

        //int a[][] = NhapMaTran(d,c), b[]=new int[100];
        int a[][]={{0,5,0,0},{0,0,1,2},{0,0,1,0},{1,2,3,4}};
        System.out.printf("\nMa tran vua nhap:\n");
        xuatMT(a, d, c);
        
        matrix(a, d, c);
        

        ArrayList<Integer> b1 = new ArrayList<>();
        cZ(a, d, c,b1);
        sL(a, d, c,b1);
        System.out.printf("\n-------------------\n");
        System.out.printf("\nFinish\n");
        xuatMT(a, d, c);
        MR(b1, c, d);

        
    }
}
