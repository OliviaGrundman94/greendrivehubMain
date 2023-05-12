/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

public class Mechanic extends Deatails {
    
    private final String companyName;
    private final String companyNumber;
    private final String about;
    

    public Mechanic(String name, String email, String password, String companyName, String companyNumber, String about) {
        super(name, email, password);
        this.companyName = companyName;
        this.companyNumber = companyNumber;
        this.about = about;
        
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAbout() {
        return about;
    }
    
}
