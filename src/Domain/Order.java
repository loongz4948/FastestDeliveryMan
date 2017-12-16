/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author OWNER
 */
public class Order {
    
    private int OrderID;
    private String CustName;
    private String Address;
    private String Status;

    public Order() {
    }

    public Order(int OrderID, String CustName, String Address, String Status) {
        this.OrderID = OrderID;
        this.CustName = CustName;
        this.Address = Address;
        this.Status = Status;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String CustName) {
        this.CustName = CustName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

   
    
    
}
