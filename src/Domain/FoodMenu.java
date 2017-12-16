/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


public class FoodMenu {
    private int foodID;
    private String foodName;
    private double price;
    private String desc;
    
    public FoodMenu(){}
    
    public FoodMenu(int foodID, String foodName, double price, String desc){
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
        this.desc = desc;
    }
    
    public FoodMenu(String foodName, double price, String desc){
        this.foodName = foodName;
        this.price = price;
        this.desc = desc;
    }
    
    public void setFoodID(int foodID){
        this.foodID = foodID;
    }
    
    public int getFoodID(){
        return foodID;
    }
    
    public void setFoodName(String foodName){
        this.foodName = foodName;
    }
    
    public String getFoodName(){
        return foodName;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String toString(){
        return String.format("F%-5d\t %-20s\t  %3.2f\t\t %-20s", getFoodID(), getFoodName(), getPrice(), getDesc());
    }
}

