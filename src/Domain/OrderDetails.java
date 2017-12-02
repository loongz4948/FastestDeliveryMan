/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

public class OrderDetails {
    private String OrderID;
    private String OrderDesc;
    private String OrderItem;
    private String OrderQuantity;
    private double OrderPrice;

    public OrderDetails() {
    }

    public OrderDetails(String OrderID, String OrderDesc, String OrderItem, String OrderQuantity, double OrderPrice) {
        this.OrderID = OrderID;
        this.OrderDesc = OrderDesc;
        this.OrderItem = OrderItem;
        this.OrderQuantity = OrderQuantity;
        this.OrderPrice = OrderPrice;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderDesc() {
        return OrderDesc;
    }

    public void setOrderDesc(String OrderDesc) {
        this.OrderDesc = OrderDesc;
    }

    public String getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(String OrderItem) {
        this.OrderItem = OrderItem;
    }

    public String getOrderQuantity() {
        return OrderQuantity;
    }

    public void setOrderQuantity(String OrderQuantity) {
        this.OrderQuantity = OrderQuantity;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(double OrderPrice) {
        this.OrderPrice = OrderPrice;
    }
    
    
    
}
