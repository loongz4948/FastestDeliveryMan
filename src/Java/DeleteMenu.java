
package Java;

import Domain.FoodMenu;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteMenu {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<FoodMenu> menuList = new ArrayList<FoodMenu>();

    public static void main(String[] args) {
        menuList.add(new FoodMenu(1, "Nasi Lemak", 5.00, "Best in Malaysia"));
        menuList.add(new FoodMenu(2, "Chicken Rice", 8.00, "Drumstik"));
        menuList.add(new FoodMenu(3, "Tom Yam Sup with Rice", 10.00, "Sour & Spicy"));
        menuList.add(new FoodMenu(4, "Curry Pan Mee", 6.50, "Traditional Taste"));
        menuList.add(new FoodMenu(5, "Chicken Chop", 15.00, "Black Pepper Sauce"));
        
        boolean isTrue;
    	char choice;
    	String temp;
        
        do{
            System.out.println();
            ShowMenu();
            
            System.out.println();
            System.out.print("Select Food to Delete [1.." +menuList.size()+ "] : ");
            int selection = input.nextInt();
            
            if(selection == 1){
                menuList.remove(selection - 1);
            }
            else if(selection == 2){
                menuList.remove(selection - 1);
            }
            else if(selection == 3){
                menuList.remove(selection - 1);
            }
            else if(selection == 4){
                menuList.remove(selection - 1);
            }
            else if(selection == 5){
                menuList.remove(selection - 1);
            }
            else{
                System.out.println("Invalid Selection!");
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
        
        System.out.println();
        ShowMenu(); 
    }
    
    public static void ShowMenu(){
        System.out.println("\t\t--Menu List--");
        System.out.println("Food ID\t\tFood Name\t\t Price(RM)\t Description");
        System.out.println("-----------------------------------------------------------------------------");
        for(int i=0; i<menuList.size(); i++){
       		System.out.println((i+1)+ ". " +menuList.get(i));
       	}
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

