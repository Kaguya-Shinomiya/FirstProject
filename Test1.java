package A;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int n, a;
        long startTime = System.currentTimeMillis();
		System.out.println("Nhap n: ");
		n=sc.nextInt();
		ArrayList<Integer> ds;
		//ArrayList<Integer> ds1;
		ds = new ArrayList<>(n);
		for(int i=0; i<n ;i++){
			System.out.printf("Nhap a[%d]: ",i);
			a=sc.nextInt();
			ds.add(a);
		}
		System.out.printf("\nTruoc khi xoa\n");
		for(int i=0; i<n ;i++){
			System.out.println(ds.get(i));
		}
		//System.out.printf("\nThuc hien\n");
		for(int z=0; z<n;z++){
		for(int i=0; i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(ds.get(i)==ds.get(j)){
					ds.remove(j);
					n--;
					}	
			}
			}	
		}
		System.out.printf("\nSau khi xoa\n");
		for(int i=0; i< n;i++){
			System.out.println(ds.get(i));
		}
		
		for(int i=0; i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(ds.get(i)>ds.get(j)){
					int tam=	ds.get(i);
					ds.set(i,ds.get(j));
					ds.set(j,tam);
				}	
			}	
		}
		System.out.printf("\nSau sap xep\n");
		for(int i=0; i< n;i++){
			System.out.println(ds.get(i));
		} 
		System.out.printf("\nTim linh kien thieu\n");
		for(int i=0; i< n;i++){
			if(ds.get(i)-i !=1&& i==0){
				for(int j= i+1; j<ds.get(i);j++){
					System.out.println(j);
					}
			}
			else if(i !=0&& ds.get(i)-ds.get(i-1)!=1){
				for(int j= ds.get(i-1); j<ds.get(i);j++){
					if(j+1	!= ds.get(i))
						System.out.println(j+1);
					}
				}
		}
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime + "ms");


		System.out.println("Nhap n: ");
		n=sc.nextInt();
		//ArrayList<Integer> ds1;
		List<Integer> ds1 = new ArrayList<>(n);
		List<Integer> ds2 = new ArrayList<>(n);
		//ds1 = new ArrayList<>(n);
		for(int i=0; i<n ;i++){
			System.out.printf("Nhap a[%d]: ",i);
			a=sc.nextInt();
			ds1.add(a);
		}

		System.out.println("Xuat danh sach");
		ds1.forEach((Num)-> System.out.println(Num));

		System.out.println("Xuat danh sach sau sap xep");
		sc.nextLine();
		//ds2.addAll(ds1.stream().sorted().collect(Collectors.toList()));
		//ds1.clear();
		//ds1.addAll(ds2);
		//ds1.sort(Comparator.naturalOrder());

		//Collections.sort(ds1, (o1, o2) -> o2 > o1? 1:-1);
		Collections.sort(ds1);
		//
		ds1.forEach((Num)-> System.out.println(Num));




		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	List<Integer> results = numbers.stream().filter(i -> {
		System.out.println("Filter: " + i);
		return i > 4;
	}).skip(0).collect(Collectors.toList());

	System.out.println("Result of skip: " + results);*/

		int a;
		String b;
		System.out.println("Nhap so thap phan: ");
		a =sc.nextInt();

		long startTime = System.currentTimeMillis();
		b=Integer.toBinaryString(a);
		System.out.println("Nhi phan: "+b);
		int count = 0;
		for(int i=0;i< b.length()-1;i++){
			if(b.charAt(i) == '1' && b.charAt(i+1) == '0' || i+1==b.length()-1 && b.charAt(i+1) == '1')
				count ++;
		}
		System.out.println("KQ: " +count);


		long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime + "ms");



		///////////////////////
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		int n;
		System.out.print("Nhap vao co so : ");
		n = sc.nextInt();

		long startTime1 = System.currentTimeMillis();
		while(n>0) {
			a1.add(n%2);
			n/=2;
		}
		int dem=1;
		a1.forEach(o-> System.out.printf("%5d",o));
		System.out.println();
		for(int i=0;i<a1.size()-1;i++) {
			if(a1.get(i)==1 && a1.get(i+1)==0)
				dem++;
			
		}
		System.out.println("So nhom cua bit 1 : "+dem);

		long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thoi gian thuc thi chuong trinh: " + elapsedTime1 + "ms");

	}
}
