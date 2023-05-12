/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import greendrivehub.Mechanic;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class Login extends HttpServlet {
    
    

    public User readData(User user) {
        User user = new User();
        Database database = new Database();
        Connection con = database.getCon();
        try {
            Statement statement; 
            statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT email, password WHERE username = +'"user.getEmail()."'+ and password = +'"user.getPassword()"'+ ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public Mechanic readData(Mechanic mechanic) {
        Mechanic mechanic = new Mechanic();
        Database database = new Database();
        Connection con = database.getCon();
        try {
            Statement statement;
            statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT email, password WHERE username = +'"mechanic.getEmail()."'+ and password = +'"mechanic.getPassword()"'+ ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return mechanic;
    }

}
