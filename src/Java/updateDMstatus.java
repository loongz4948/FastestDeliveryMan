package Java;

import Domain.updateStatus;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class updateDMstatus {

    Scanner sc = new Scanner(System.in);
    ArrayList<updateStatus> add = new ArrayList<>();
    int i;
    int c;
    String userInput;
    String input;
    String ans;

    public void dmDetails() {
        add.add(new updateStatus(1000, "AshLim", "Active"));
        add.add(new updateStatus(1001, "YKS", "InActive"));
        add.add(new updateStatus(1002, "AlanTan", "Resign"));
    }

     public void Run() {
      c = 0;
       if (c == 0) {
          dmDetails();
          Find();
       } else {
          Find();
     }
       }
    //public void Find() {
    //System.out.println();
    //System.out.println("Enter a ID to change the delivery man status: ");
    // ans = sc.nextLine();
    // for (i = 0; i < add.size(); i++) {
    // if (Integer.parseInt(ans) == add.get(i).getDmID()) {
    //   View();
    //  }
//            if(count ==1){
//                resume();
//            }
    // }
    // }
    public void Find() {
        System.out.println("===================================");
        System.out.println("Delivery Man Status");
        System.out.println("===================================");
        for (i = 0; i < add.size(); i++) {
        System.out.println("ID:" + add.get(i).getDmID());
        System.out.println("Name:" + add.get(i).getDmName());
        System.out.println("Status:" + add.get(i).getStatus());  
        System.out.println("===================================");
        
    }
        select();
    }

    
    public void select() {
        System.out.println("************************");
        System.out.println("Select a ID to change status > ");
        System.out.println("************************");
        input = sc.nextLine();

        for (i = 0; i < add.size(); i++) {
            if (Integer.parseInt(input) == add.get(i).getDmID()) {
                System.out.println("===================================");
        System.out.println("Delivery Man Status");
        System.out.println("===================================");
        System.out.println("ID:" + add.get(i).getDmID());
        System.out.println("Name:" + add.get(i).getDmName());
        System.out.println("Status:" + add.get(i).getStatus());  
        System.out.println("===================================");
                
            
            System.out.println("Select a status > ");
            System.out.println("1. set to Active");
            System.out.println("2. set to InActive");
            System.out.println("3. set to Resign");
            System.out.println("4. Cancel");
            input = sc.nextLine();
            }
            switch (input) {
                case "1":
                String st = "Active";
                        System.out.println("");
                        System.out.println("Changed Successful!");
                        add.get(i).setStatus(st);
                        System.out.println("");
                        finalView();
                break;
            case "2":
                String st1 = "Active";
                        System.out.println("");
                        System.out.println("Changed Successful!");
                        add.get(i).setStatus(st1);
                        System.out.println("");
                        finalView();

                break;
            case "3":
                String st2 = "Active";
                        System.out.println("");
                        System.out.println("Changed Successful!");
                        add.get(i).setStatus(st2);
                        System.out.println("");
                        finalView();
                break;
            case "0":
                exit();
                break;
            }
            
        }

    }

    public void finalView() {
        System.out.println("===================================");
        System.out.println("Delivery Man Status");
        System.out.println("===================================");
        System.out.println("ID:" + add.get(i).getDmID());
        System.out.println("Name:" + add.get(i).getDmName());
        System.out.println("Status:" + add.get(i).getStatus());
        System.out.println("===================================");
        System.out.println("****************************************************");
        System.out.println("Do you want continue? [Y/N]");
        System.out.println("****************************************************");
        String answer = sc.nextLine();
        switch (answer) {
            case "Y":
                Find();
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
        updateDMstatus uDMs = new updateDMstatus();
        uDMs.Run();
    }

}
