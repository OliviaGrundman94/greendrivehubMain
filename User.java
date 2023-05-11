/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

import java.io.InputStream;

/**
 *
 * @author noemi
 */
public class User {
    
    private String name;
    private String mobile;
    private String email;
    private String password;
    private String carMakeModel;
    private String carRegistration;
    private InputStream uploadedImage;

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
