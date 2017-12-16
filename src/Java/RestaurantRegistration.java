
package Java;


import Domain.Restaurant;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantRegistration {
    static Scanner input = new Scanner(System.in);
    public static Restaurant rest = new Restaurant();
    public static ArrayList<Restaurant> restList = new ArrayList<>();
     
    public static void main(String[] args) {
        registration();
    }
     
    public static void registration(){
        boolean isTrue;
    	char choice;
    	String temp;
        
        do{
            System.out.println("===========================");
            System.out.println("FD Restaurant Registration");
            System.out.println("===========================");
            System.out.println("Restauarant ID : " +rest.getNextID());
            System.out.print("Restaurant Name : ");
            String name = input.nextLine();
            System.out.print("Restaurant License Code : ");
            int licenseCode = input.nextInt();
            System.out.print("Restaurant Address : ");
            String address = input.next();
            System.out.print("Restaurant Phone Number : ");
            int phoneNum = input.nextInt();
            System.out.print("Restaurant Description : ");
            String decs = input.next();
            
            
            Restaurant rest = new Restaurant(Restaurant.getNextID(),name, address, phoneNum, decs, licenseCode);
            restList.add(rest);
       
            System.out.println("\n\nCongrats! Successfully registered.");
            System.out.print("\n\nRESTAURANT DETAILS\n");
            System.out.println("ID\tName\t\t\tAddress\t\t\tContact No.\t\tDescription\t\tLicense Code ");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
                for(int i=0; i<restList.size(); i++){
    			System.out.print(restList.get(i));
    			System.out.println();
    		}
        
            do{
      	 	isTrue = true;
       	 	System.out.print("\nDo you want to continue(Y/N)? "); 
       	 	temp = input.next();
       	        
       	 	if (validateChar(temp)){
                    if (temp.toUpperCase().charAt(0) == 'Y' || temp.toUpperCase().charAt(0) == 'N')
       			isTrue = false;
       	 	}
       	
            }while(isTrue); 
            choice = temp.charAt(0);
        }while(Character.toUpperCase(choice) == 'Y');
    }
    
     public static boolean validateChar (String str) {
    	boolean hasDigit = false;
    	boolean hasLetter = false;
    	
    	for (int i=0 ; i<str.length() ; i++){
            if (Character.isDigit(str.charAt(i)))
		hasDigit = true;
            if (Character.isLetter(str.charAt(i)))
                hasLetter = true;		
    	}
    	
    	if(hasLetter && !hasDigit)
            return true;
    	else 
            return false;
    }
}



