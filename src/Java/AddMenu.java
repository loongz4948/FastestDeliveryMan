/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;


import Domain.MenuItem;
import java.util.ArrayList;
import java.util.Scanner;


public class AddMenu {
    public static ArrayList<MenuItem> menuList = new ArrayList<>();
    public static MenuItem menu = new MenuItem();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isTrue;
    	char choice;
    	String temp;
        
        do{
            System.out.println();
            System.out.println("Food ID : F" +MenuItem.getNextID());
            System.out.print("Enter Food Name : ");
            String name = input.next();
            System.out.print("Enter Food Price : RM ");
            double price = input.nextDouble();
            System.out.print("Enter Food Description : ");
            String desc = input.next();
            
            MenuItem menu = new MenuItem(MenuItem.getNextID(), name, price, desc);
            menuList.add(menu);
        
            do{
      	 	isTrue = true;
       	 	System.out.print("\nDo you want to add more item(Y/N)? "); 
       	 	temp = input.next();
       	        
       	 	if (validateChar(temp)){
                    if (temp.toUpperCase().charAt(0) == 'Y' || temp.toUpperCase().charAt(0) == 'N')
       			isTrue = false;
       	 	}
       	
            }while(isTrue); 
            choice = temp.charAt(0);
        }while(Character.toUpperCase(choice) == 'Y');
        
        System.out.println("\n\n\t\t-------- Menu List --------");
        System.out.println("Food ID\t Food Name\t\t Price(RM)\t Description");
        
        for(int i=0; i<menuList.size(); i++){
            System.out.println(menuList.get(i));
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
