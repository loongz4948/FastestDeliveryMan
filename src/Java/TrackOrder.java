package Java;

import Domain.Order;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrackOrder {

    Scanner sc = new Scanner(System.in);
    ArrayList<Order> add = new ArrayList<>();
    int i;
    int c;
    String userInput;
    String input;
    String ans;

    public void Order() {
        add.add(new Order(1001, "AshLim", "KL","On delivery"));
        add.add(new Order(1002, "YKS", "Setapak","On pending"));
        add.add(new Order(1003, "AlanTan", "KL","Received"));
    }

     public void Run() {
      c = 0;
       if (c == 0) {
          Order();
          select();
       } else {
          select();
     }
       }


    
    public void select() {
        
        System.out.println("Enter ID : ");
        
        input = sc.nextLine();

        for (i = 0; i < add.size(); i++) {
            if (Integer.parseInt(input) == add.get(i).getOrderID()) {
             finalView();
  
            }else{
                 System.out.println("===================================");
                System.out.println("Invalid ID");
                 System.out.println("===================================");
                  System.out.println("");
            }
          
            
        }

    }

    public void finalView() {
        System.out.println("===================================");
        System.out.println("Track Order");
        System.out.println("===================================");
        System.out.println("ID:" + add.get(i).getOrderID());
        System.out.println("Name:" + add.get(i).getCustName());
        System.out.println("Address:" + add.get(i).getAddress()); 
        System.out.println("Status:" + add.get(i).getStatus());
        System.out.println("===================================");
        System.out.println("***********************************");
        System.out.println("Do you want continue? [Y/N]");
        System.out.println("***********************************");
        String answer = sc.nextLine();
        switch (answer) {
            case "Y":
                select();
                break;
            case "N":
                System.out.println("Thanks for using our system~");
                System.out.println("");
                break;
            default:
                System.out.println("Invalid input! (Y/N)");
                System.out.println("");
                finalView();
                break;
        }
    }

    public void exit() {
        System.out.println("");
        System.out.println("End Process ");

    }

    public static void main(String[] args) {
        TrackOrder uDMs = new TrackOrder();
        uDMs.Run();
    }

}
