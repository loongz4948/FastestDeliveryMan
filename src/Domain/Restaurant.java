
package Domain;

public class Restaurant {
    private int restID;
    private String restName;
    private String restAddress;
    private int restPhoneNum;
    private String restDesc;
    private int restLicenseCode;
    private static int nextID = 1000;
    
    public Restaurant() {}
    
    public Restaurant(int restID, String restName, String restAddress, int restPhoneNum, String restDesc, int restLicenseCode){
        this.restID = nextID++;
        this.restName = restName;
        this.restAddress = restAddress;
        this.restPhoneNum = restPhoneNum;
        this.restDesc = restDesc;
        this.restLicenseCode = restLicenseCode;
    }
    
    public Restaurant(int restID){
        this.restID = restID;
    }
    
    public Restaurant(String restName){
        this.restName = restName;
        this.restID = nextID++;
    }
    
    public void setRestaurantID(int restID){
        this.restID = restID;
    }
    
    public int getRestID(){
        return restID;
    }
    
    public void setRestName(String restName){
        this.restName = restName;
    }
    
    public String getRestName(){
        return restName;
    }
    
    public void setRestAddress(String restAddress){
        this.restAddress = restAddress;
    }
    
    public String getRestAddress(){
        return restAddress;
    }
    
    public void setRestPhoneNum(int restPhoneNum){
        this.restPhoneNum = restPhoneNum;
    }
    
    public int getRestPhoneNum(){
        return restPhoneNum;
    }
    
    public void setRestDesc(String restDesc){
        this.restDesc = restDesc;
    }
    
    public String getRestDecs(){
        return restDesc;
    }
    
    public void setRestLicenseCode(int restLicenseCode){
        this.restLicenseCode = restLicenseCode;
    }
    
    public int getRestLicenseCode(){
        return restLicenseCode;
    }
    
    public void setNextID(int nextID){
        Restaurant.nextID = nextID;
    }
    
    public static int getNextID(){
        return nextID;
    }
    
    public String toString(){
            return String.format("%-5d\t%-20s\t%-20s\t%10d\t\t%-20s\t%10d", getRestID(), getRestName(), getRestAddress(), getRestPhoneNum(), getRestDecs(), getRestLicenseCode());
        }
}

