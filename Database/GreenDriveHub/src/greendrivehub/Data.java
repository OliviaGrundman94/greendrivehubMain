/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {

    public void writeData(User user) {
        Database database = new Database();
        Connection connection = database.getCon();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(
                "INSTER INTO User(Name, Mobile, Email, Password, CarMakeModel, CarRegistration, UploadedImage) "
                + "VALUES ('" + user.getName() + "','" + user.getMobile() + "','" + user.getEmail() + "','" + user.getPassword()
                + "', '" + user.getCarMakeModel() + "', '" + user.getCarRegistration() + "', '" + user.getUploadedImage() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void writeData(Mechanic mechanic) {
        Database database = new Database();
        Connection connection = database.getCon();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(
                "INSTER INTO User(Name, CompanyName, CompanyNumber, Email, Password, About) "
                + "VALUES ('" + mechanic.getName() + "','" + mechanic.getCompanyName() + "','" + mechanic.getCompanyNumber() 
                + "', '" + mechanic.getEmail() + "','" + mechanic.getPassword() + "', '" + mechanic.getAbout() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
