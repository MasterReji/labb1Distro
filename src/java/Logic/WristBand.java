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
public class WristBand {
    
    private int iD = 0;
    private String model = null;
    private int price = 0;
    
    public WristBand(String iD, String model, String price){
        this.iD = Integer.parseInt(iD);
        this.model = model;
        this.price = Integer.parseInt(price);
    }

    /***
     * 
     *  Getters and Setters
     * 
     */
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
