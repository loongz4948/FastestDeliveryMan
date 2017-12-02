/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

public class DeliveryManDetails {
    private int DMID;
    private String Status;

    public DeliveryManDetails() {
    }

    public DeliveryManDetails(int DMID, String Status) {
        this.DMID = DMID;
        this.Status = Status;
    }

    public int getDMID() {
        return DMID;
    }

    public void setDMID(int DMID) {
        this.DMID = DMID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    
}
