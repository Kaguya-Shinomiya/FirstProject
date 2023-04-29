package A;

import java.nio.charset.StandardCharsets;
import java.security.*;

public class Test2 {

    //Test mã hóa
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    



    public static void main(String args[]) {
        String s1 = "this is index of example ex";
        int index1 = s1.lastIndexOf('s');
        int index2 = s1.lastIndexOf("ex");
        System.out.println("Last index");
        System.out.println(index1);//6 
        System.out.println(index2);//17

        
        int index3 = s1.indexOf('s');
        int index4 = s1.indexOf("ex");
        System.out.println("index of");
        System.out.println(index3);//6 
        System.out.println(index4);//17


        String s2 = "Ho Chi Minh";
        System.out.println("S2: "+s2.indexOf("Chi"));



        /*String input = "Hello world";
        System.out.println("Chuoi ban dau: "+input);
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(input.getBytes());
            String hash = bytesToHex(hashedBytes);
            System.out.println("Ma hoa: " + hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }*/
        
        String input = "Hello world";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(input.getBytes());
            String hash = bytesToHex(hashedBytes);
            System.out.println("Ma hoa: " + hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
