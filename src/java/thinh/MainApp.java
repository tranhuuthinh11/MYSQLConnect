/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thinh;
import java.sql.DriverManager;
/**
 *
 * @author thinh
 */
public class MainApp {
            public static void main(String[] args) {
                // Tên cơ sở dữ liệu
                String DB_URL = "jdbc:mysql://localhost:3306/shop";
                // Tên người dùng 
                String DB_USER = "root";
                // Mật khẩu
                String DB_PASS = "";
                try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
	            DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	            System.out.println("Kết nối thành công ");
                } catch (Exception e) {
                }
            }
}
