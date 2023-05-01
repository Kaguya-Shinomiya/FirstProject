package bmt;

import java.sql.*;


public class Connect_2_Data {
    static final String DB_URL ="jdbc:sqlserver://localhost:1433;databaseName=Book_Store;user=sa;password=12345;encrypt=false" ;
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt =conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Account")) 
        {
            while (rs.next()) {
                int id = rs.getInt("ID");
                String firstName = rs.getString("First_Name");
                String lastName = rs.getString("Last_Name");
                String Email = rs.getString("Email");
                float Phone_Number = rs.getFloat("Phone_Number");

                System.out.println("ID: " + id);
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Email: " + Email);
                System.out.println("Phone_Number: " + Phone_Number);
                System.out.println("===============================");
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
