/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author noemi
 */
public class Database {
    
    public Connection connection;
    
    public Connection getCon(){
        try {
            Class.forName ("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbc:mysql://localhost:3306/GreenDriveHub, "root", "PassWord.SQL.21!");
        } catch (ClassNotfoundException e){
            e.printStackTrace();
        } catch (SQLExeption e){
            e.printStackTrace();
        }
        return connection;
    }  
}
