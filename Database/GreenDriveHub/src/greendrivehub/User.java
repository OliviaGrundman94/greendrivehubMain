/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

import java.io.InputStream;

public class User extends Deatails{
    
    protected String mobile;
    protected String carMakeModel;
    protected String carRegistration;
    protected InputStream uploadedImage;

    public User(String name, String email, String password,
                String mobile, String carMakeModel, String carRegistration, InputStream uploadedImage) {
        super(name, email, password);
        this.mobile = mobile;
        this.carMakeModel = carMakeModel;
        this.carRegistration = carRegistration;
        this.uploadedImage = uploadedImage;
    }


    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCarMakeModel() {
        return carMakeModel;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public InputStream getUploadedImage() {
        return uploadedImage;
    }
    
}
