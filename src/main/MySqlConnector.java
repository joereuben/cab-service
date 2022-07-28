/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * A utility class to connect to a MYSQL Database
 * @author MBEAH
 */
public class MySqlConnector {
    
    private  Connection connection; //connection property
    private String url = "jdbc:mysql://localhost:3306/greenwichcabs?characterEncoding=utf8";// database url
    private String dbUser = "root";// database user
    private String dbPassword = "";// //database password for user
    
    
    public MySqlConnector(){
//        connect();
    }
    
     public static void main(String[] args) {
        
        new MySqlConnector().connect();
    }

    public void connect(){
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection connection = 
                    DriverManager.getConnection(url,dbUser,dbPassword);
            
//            System.out.println("Connection Successful!");
            //here sonoo is database name, root is username and password  
//            Statement stmt=connection.createStatement();  
//            ResultSet rs = stmt.executeQuery("select * from emp");  
//            while(rs.next())  
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
              connection.close();  
        }catch(Exception e){
                System.out.println(e);
        }  
          
    }
    
    /**
     * queries the database for data
     * @param query the SQL statement
     * @return a result set of the data
     */
    public ResultSet query(String query){
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection connection = 
                    DriverManager.getConnection(url,dbUser,dbPassword);  
            Statement stmt=connection.createStatement();  
            rs = stmt.executeQuery(query);
//            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;  
    }
    
    /**
     * executes an SQL statement on the database
     * @param query the SQL  statement
     * @return true if successful, false otherwise
     */
     public boolean queryExecute(String query){
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection connection = 
                    DriverManager.getConnection(url,dbUser,dbPassword); 
            Statement stmt=connection.createStatement();  
            stmt.execute(query);
            
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;  
    }
    
}
