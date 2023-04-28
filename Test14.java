package A;


//import java.util.HashMap;
//import java.util.Map;

public class Test14 {
    public static boolean checkStrongPassword(String s) {
		int demDB = 0, demChuH = 0, demSo = 0, demChuT = 0;
		if (s.length() < 6)
			return false;
		else {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) >='A'&&s.charAt(i)<='Z')
					demChuH++;
				else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					demChuT++;
				else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
					demSo++;
				else
					demDB++;
			}
		}
		return (demDB != 0 && demChuH != 0 && demSo != 0 && demChuT != 0) ? true : false;
	}


    public static void main(String args[]) {
        System.out.println("Password: "+2456+"\t"+checkStrongPassword("2456"));
        System.out.println("Password: "+"s2456\t"+checkStrongPassword("s2456"));
        System.out.println("Password: "+"s245677\t"+checkStrongPassword("s245677"));
        System.out.println("Password: "+"Pi=3,1415926535\t"+checkStrongPassword("Pi=3,1415926535"));
        
        System.out.println("Password: "+"aaaaaa3! \t"+checkStrongPassword("aaaaaa3!"));
    }
}