package A;

public class Test23 {
    public int a1=20;
    int t =4;

    public static void Basketball(int a[]){
        int MAX, MIN, SMAX=0, SMIN=0;
        MAX = MIN = a[0];
        System.out.println("Game"+"\tScore"+"\tMinimum"+"\tMaximum"+"\tMin"+"\tMax");   
        System.out.println(0+"\t "+a[0]+"\t "+MIN+"\t "+MAX+"\t "+SMIN+"\t "+SMAX);   
        for(int i=1;i<a.length;i++){
            SMAX=0; 
            SMIN=0;
            if(MAX < a[i]){
                MAX = a[i];
                SMAX++;
            }

            if(MIN > a[i]){
                MIN = a[i];
                SMIN++;
            }
            System.out.println(i+"\t "+a[i]+"\t "+MIN+"\t "+MAX+"\t "+SMIN+"\t "+SMAX);    
            
        }
    }

    public  void TestVoid(){
        String s ="Test";
        System.out.println("\n"+s);
    }
    public String toString(){
        return "Test";
    }

    public String toString(int s){
        return "Test444";
    }
    public void TestVoid(int x){
        x=x*2;
        a1=a1*2;
        System.out.println(x+"\t"+a1);
    }
    public static void main(String[] args)  {
        
        int a[] = {10,5,20,20,4,5,2,25,1};

        //Basketball(a);

        int k =01500;
        System.out.println(k);


        Test23 te = new Test23();
        te.TestVoid();
        System.out.println(te);

        te.TestVoid(10);

        
        String s =Character.toString('k');
        String s1 ="1234556";
        
       


    }
}
