package A;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

//import java.security.*;

public class Test29 {

    //Test mã hóa
    /*private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }*/
    public static void main(String[] args) {
        //try {
           // Ghi dữ liệu vào tệp tin
           /*FileWriter writer = new FileWriter("D:\\Quang Bao(LQB)\\example.txt");
           writer.write("Hello World!");
           writer.close();
  
           // Đọc dữ liệu từ tệp tin
           FileReader reader = new FileReader("example.txt");
           BufferedReader bufferedReader = new BufferedReader(reader);
           String line = bufferedReader.readLine();
           bufferedReader.lines();
           System.out.println(line);
           reader.close();
            }catch (IOException e) {
                e.printStackTrace();
            }*/

        //Ghi chuỗi mã hóa vào tập tin


        String input = "Farewell! thou art too dear for my possessing, And like enough thou know'st thy estimate, ";
        
        input=input.concat("For how do I hold thee but by thy granting, And for that riches where is my deserving? The cause of this fair gift in me is wanting, ");
        input=input.concat("And so my patent back again is swerving. Thy self thou gav'st, thy own worth then not knowing, Or me to whom thou gav'st it, else mistaking, ");
        input=input.concat("So thy great gift upon misprision growing, Comes home again, on better judgement making. Thus have I had thee as a dream doth flatter, In sleep a king, but waking no such matter.");
        System.out.println(input);
        /*try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(input.getBytes());
            String hash = bytesToHex(hashedBytes);
            System.out.println("Ma hoa: " + hash);
            FileWriter writer = new FileWriter("D:\\Quang Bao(LQB)\\example.txt");
            writer.write(hash);
            writer.close();
  
           // Đọc dữ liệu từ tệp tin
            FileReader reader = new FileReader("D:\\Quang Bao(LQB)\\example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            bufferedReader.lines();
            System.out.println(line);
            
            reader.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }*/

        try {
            // Ghi dữ liệu vào tệp tin
            FileWriter writer = new FileWriter("D:\\Quang Bao(LQB)\\example.txt");
            writer.write(input);
            writer.close();
   
            // Đọc dữ liệu từ tệp tin
            FileReader reader = new FileReader("D:\\Quang Bao(LQB)\\example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            bufferedReader.lines();
            System.out.println(line);
            reader.close();
            }catch (IOException e) {
                 e.printStackTrace();
            }
    }
}
