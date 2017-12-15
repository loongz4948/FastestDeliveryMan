package Domain;
public class Menu {

        private String foodID;
        private String foodName;
        private double price;
        private int quantity;
        
        public Menu(String foodID,String foodName,double price){
           this.foodID = foodID;
           this.foodName = foodName;
           this.price = price;
           this.quantity = 0;
        }
        
        public Menu(String foodID,String foodName,double price,int quantity){
           this.foodID = foodID;
           this.foodName = foodName;
           this.price = price;
           this.quantity = quantity;
        }
        
        public Menu(int quantity){
           this.foodID = "";
           this.foodName = "";
           this.price = 0.0;
           this.quantity = quantity;
        }
        
        public void setFoodID(String foodID){
            this.foodID = foodID;
        }
        
        public String getFoodID(){
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
        
        public void setQuantity(int quantity){
            this.quantity = quantity;
        }
        
        public int getQuantity(){
            return quantity;
        }
        
        public String toString(){
            return String.format("%5s\t\t%-20s\t\t%10.2f\t",foodID,foodName,price);
        }
}
