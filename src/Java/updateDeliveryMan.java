/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import Domain.AddFunction;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class updateDeliveryMan {

    Scanner sc = new Scanner(System.in);
    ArrayList<AddFunction> add = new ArrayList<>();
    int i;
    int c;
    String userInput;
    String input;
    String ans;

    public void AddDetails() {
        add.add(new AddFunction("Ash Lim", 1000, "971219-10-2536", "012-3659321", "ashlim@hotmail.com", "No A-5-9 PV10 SETAPAK", "MALE"));
    }

    public void Run() {
        c = 0;
        if (c == 0) {
            AddDetails();
            Find();
        } else {
            Find();
        }
    }

    public void Find() {
        System.out.println();
        System.out.println("Key in ID to view Delivery man record:");
        System.out.println();
        ans = sc.nextLine();
        for (i = 0; i < add.size(); i++) {
            if (Integer.parseInt(ans) == add.get(i).getDmID()) {
                View();

            }
//            if(count ==1){
//                resume();
//            }
        }
    }

    public void View() {
        System.out.println("===================================");
        System.out.println("Delivery Man Details");
        System.out.println("===================================");
        System.out.println("ID:" + add.get(i).getDmID());
        System.out.println("Name:" + add.get(i).getDmName());
        System.out.println("Gender:" + add.get(i).getDmGender());
        System.out.println("IC Number:" + add.get(i).getDmIC());
        System.out.println("H/P Number:" + add.get(i).getDmHP());
        System.out.println("Email:" + add.get(i).getDmEmail());
        System.out.println("Address:" + add.get(i).getDmAddress());
        System.out.println("===================================");
        update();
    }

    public void update() {
        System.out.println("************************");
        System.out.println("Update for > ");
        System.out.println("1. Contact Number");
        System.out.println("2. Email");
        System.out.println("3. Address");
        System.out.println("0. Exit");
        System.out.println("************************");
        System.out.println("");
        input = sc.nextLine();

        switch (input) {
            case "1":
                System.out.print("Enter new contact number : ");
                String upd = sc.nextLine();
                Pattern pattern = Pattern.compile("\\d{3}-\\d{7,8}");
                Matcher matcher = pattern.matcher(upd);
                if (!matcher.matches()) {
                    System.out.println("Invalid Format! E.g. 011-23456789");
                    System.out.println("");
                    update();
                } else {
                    System.out.println("");
                    System.out.println("Update Successful!");
                    add.get(i).setDmHP(upd);
                    System.out.println("");
                    finalView();
                }
                break;
            case "2":
                System.out.println("Enter new Email:");
                String email = sc.nextLine();
                Pattern Epattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                Matcher Ematcher = Epattern.matcher(email);
                if (!Ematcher.matches()) {
                    System.out.println("Invalid Format! E.g. abc@hotmail.com ");
                    System.out.println("");
                    update();
                } else {
                    System.out.println("");
                    System.out.println("Update Successful");
                    add.get(i).setDmEmail(email);
                    System.out.println("");
                    finalView();
                }

                break;
            case "3":
                System.out.println("Enter new Address :");
         
                String home = sc.nextLine();
     
                if (home.isEmpty()) {
                    System.out.println("Please don't leave the blank empty!");
                    System.out.println("");
                    update();
                } else {
                    System.out.println("");
                    System.out.println("Update Successful!");
                    add.get(i).setDmAddress(home);
                    System.out.println("");
                    finalView();
                }
                break;
            case "0":
                exit();
                break;
        }

    }

    public void finalView() {
        System.out.println("===================================");
        System.out.println("Delivery Man Details");
        System.out.println("===================================");
        System.out.println("ID:" + add.get(i).getDmID());
        System.out.println("Name:" + add.get(i).getDmName());
        System.out.println("Gender:" + add.get(i).getDmGender());
        System.out.println("IC Number:" + add.get(i).getDmIC());
        System.out.println("H/P Number:" + add.get(i).getDmHP());
        System.out.println("Email:" + add.get(i).getDmEmail());
        System.out.println("Address:" + add.get(i).getDmAddress());
        System.out.println("===================================");
        System.out.println("****************************************************");
        System.out.println("Do you want continue? [Y/N]");
        System.out.println("****************************************************");
        String answer = sc.nextLine();
        switch (answer) {
            case "Y":
                View();
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
        updateDeliveryMan uDM = new updateDeliveryMan();
        uDM.Run();
    }

}
