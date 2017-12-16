/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


public class deliveryManStatus {
    private String DMID;
    private String DMPW;
    private String Status;

    public deliveryManStatus() {
    }

    public deliveryManStatus(String DMID, String DMPW, String Status) {
        this.DMID = DMID;
        this.DMPW = DMPW;
        this.Status = Status;
    }

    public String getDMID() {
        return DMID;
    }

    public void setDMID(String DMID) {
        this.DMID = DMID;
    }

    public String getDMPW() {
        return DMPW;
    }

    public void setDMPW(String DMPW) {
        this.DMPW = DMPW;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
   
    
    
}
