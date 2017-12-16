
package Domain;


public class MenuItem {
    private int foodID;
    private String foodName;
    private double price;
    private String desc;
    private static int nextID = 001;
    
    public MenuItem(){}
    
    public MenuItem(int foodID, String foodName, double price, String desc){
        this.foodID = nextID++;
        this.foodName = foodName;
        this.price = price;
        this.desc = desc;
    }
    
    public void setFoodID(int foodID){
        this.foodID = foodID;
    }
    
    public int getFoodID(){
        return foodID++;
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
    
    public static int getNextID(){
        return nextID;
    }
    
    public String toString(){
        return String.format("F%-5d\t %-20s\t  %3.2f\t\t %-20s", getFoodID(), getFoodName(), getPrice(), getDesc());
    }
}
