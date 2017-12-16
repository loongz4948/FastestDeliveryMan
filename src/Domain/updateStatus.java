/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


public class updateStatus {
    private int dmID;
    private String dmName;
    private String status;
    
   public updateStatus() {
    }
   
   public updateStatus(int dmID, String dmName, String status)
   {
       this.dmID = dmID;
       this.dmName = dmName;
       this.status = status;
   }

    public int getDmID() {
        return dmID;
    }

    public void setDmID(int dmID) {
        this.dmID = dmID;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
   
   
   
}

