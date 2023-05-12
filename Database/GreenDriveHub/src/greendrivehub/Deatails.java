/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greendrivehub;

public abstract class Deatails {

    protected String name;
    protected String email;
    protected String password;

    public Deatails(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
