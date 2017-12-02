/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


public class AddFunction 
{
    private String dmName;
    private int dmID;
    private String dmIC;
    private String dmHP;
    private String dmEmail;
    private String dmAddress;
    private String dmGender;

    public AddFunction() {
    }

    public AddFunction(String dmName, int dmID, String dmIC, String dmHP, String dmEmail, String dmAddress, String dmGender) {
        this.dmName = dmName;
        this.dmID = dmID;
        this.dmIC = dmIC;
        this.dmHP = dmHP;
        this.dmEmail = dmEmail;
        this.dmAddress = dmAddress;
        this.dmGender = dmGender;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }

    public int getDmID() {
        return dmID;
    }

    public void setDmID(int dmID) {
        this.dmID = dmID;
    }

    public String getDmIC() {
        return dmIC;
    }

    public void setDmIC(String dmIC) {
        this.dmIC = dmIC;
    }

    public String getDmHP() {
        return dmHP;
    }

    public void setDmHP(String dmHP) {
        this.dmHP = dmHP;
    }

    public String getDmEmail() {
        return dmEmail;
    }

    public void setDmEmail(String dmEmail) {
        this.dmEmail = dmEmail;
    }

    public String getDmAddress() {
        return dmAddress;
    }

    public void setDmAddress(String dmAddress) {
        this.dmAddress = dmAddress;
    }

    public String getDmGender() {
        return dmGender;
    }

    public void setDmGender(String dmGender) {
        this.dmGender = dmGender;
    }
    
    
}
