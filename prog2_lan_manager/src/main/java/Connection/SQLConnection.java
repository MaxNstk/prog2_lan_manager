/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    
    private static Connection connection = null;
    
    static final String DB_URL = "jdbc:sqlite:C:\\Users\\max\\Documents\\PROG2\\prog2_lan_manager\\prog2_lan_manager\\src\\main\\java\\Connection\\lanManager.db";
  
    
    static final String USER = "se";
    static final String PASS = "sa";
    
    
    public static Connection connect() {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
    public static void disconnect(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}