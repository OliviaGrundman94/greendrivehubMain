/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author noemi
 */
public class GetData {
    
    public String userName = request.getParameter("userName");
    public String mobile = request.getParameter("mobile");
    public String userEmail = request.getParameter("userEmail");
    public String userPassword = request.getParameter("userPassword");
    public String carMakeModel = request.getParameter("carMakeModel");
    public String carRegistration = request.getParameter("carRegistration");
    public InputStream uploadedImage = request.getParameter("uploadedImage");
    
    public String mecName = request.getParameter("userName");
    public String companyName = request.getParameter("companyName");
    public String companyNumber = request.getParameter("companyNumber");
    public String mecEmail = request.getParameter("mecEmail");
    public String mecPassword = request.getParameter("mecPassword");
    public String about = request.getParameter("about");
    
    
    
    
    
    
    public void writeData (User user){
        Database database = new Database();
        Connection connection = database.getCon();
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSTER INTO User(Name, Mobile, Email, Password, CarMakeModel, CarRegistration, UploadedImage) VALUES ('"+userName+"','"+mobile+"','"+userEmail+"','"+userPassword+"', '"+carMakeModel+"', '"+carRegistration+"', '"+uploadedImage+"')");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    
     
    public void writeData (Mechanic mechanic){
        Database database = new Database();
        Connection connection = database.getCon();
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSTER INTO User(Name, CompanyName, CompanyNumber, Email, Password, About) VALUES ('"+mecName+"','"+companyName+"','"+companyNumber+"', '"+mecEmail+"','"+mecPassword+"', '"+about+"')");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    
}
