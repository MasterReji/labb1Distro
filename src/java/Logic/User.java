/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Reimondo
 */
public class User {


    private int iD = 0;
    private String name = null;
    private String password = null;
    private String ddress = null;
    private String city = null;
    
    public User(String iD, String name, String password)
    {
        this.iD = Integer.parseInt(iD);
        this.name = name;
        this.password = password;
    }

    /**
     Getters and Setters 
     */
    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDdress(String ddress) {
        this.ddress = ddress;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public int getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getDdress() {
        return ddress;
    }

    public String getCity() {
        return city;
    }
    
}
