/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ebs;

/**
 *
 * @author tanvi
 */
import java.sql.*;
/**
 *
 * @author tanvi
 */
public class connectionProvider {
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/ebs";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn=DriverManager.getConnection(url,user,password);  
            return conn;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error! Could not connect to the database!" + e);
            return null;
        }
    }
}
