/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;
import Domain.deliveryManStatus;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class setStatus {
    Scanner scan = new Scanner(System.in);
    ArrayList<deliveryManStatus> DMD = new ArrayList<>();
    int i;
    int index;
    int c;
    String userInput;
    
    public void DMDetails(){
        DMD.add(new deliveryManStatus("1001","1001","Not Available"));
        DMD.add(new deliveryManStatus("1002","1002","Not Available"));
        DMD.add(new deliveryManStatus("1003","1003","Not Available"));
        DMD.add(new deliveryManStatus("1004","1004","Not Available"));
    }
    
    public void Login(){
        String sta = "Available";
        System.out.println("==============================================");
        for(int index = 0 ; index < DMD.size() ; index ++){
        System.out.println("Delivery Man ID: " + DMD.get(index).getDMID());
        System.out.println("Delivery Man Status: " + DMD.get(index).getStatus());
        }
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("LOGIN");
        System.out.println("==============================================");
        System.out.print("ID:");
        userInput = scan.nextLine();
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(userInput);
        if (!matcher.matches()) {
            System.out.println("**********************************************");
            System.out.println("Invalid Format! E.g. 1001");
            System.out.println("**********************************************");
            System.out.println("");
            Login();
        }
        int count = 0;
        for (i = 0; i < DMD.size(); i++) {
           if(!userInput.equals(DMD.get(i).getDMID())){
               System.out.println("**********************************************");
               System.out.println("ID is invalid");
               System.out.println("**********************************************");
               System.out.println("");
               Login();
           }else{
             if (userInput.equals(DMD.get(i).getDMID())) {
                 System.out.print("Password : ");
                 userInput = scan.nextLine();        
                 if (userInput.equals(DMD.get(i).getDMPW())) {

                     count = 1;
                 }
                 if(DMD.get(i).getStatus().equals(sta)){
                     System.out.println("**********************************************");
                     System.out.println("Account is already login");
                     System.out.println("**********************************************");
                     System.out.println("");
                     Login();
                 }
                 if(count ==1){
                     System.out.println("**********************************************");
                     System.out.println("Login Successful");
                     System.out.println("**********************************************");
                     System.out.println("");
                     DMD.get(i).setStatus(sta);
                     Login();
                 }else{
                     System.out.println("**********************************************");
                     System.out.println("Invalid Password or ID");
                     System.out.println("**********************************************");
                     System.out.println("");
                     Login();
                 }
              }
           }
        }   
    }
    
//    public void view(){
//        System.out.println("==============================================");
//        System.out.println("Delivery Man ID: " + DMD.get(i).getDMID());
//        System.out.println("Clock In Time: " + getDateTime());
//        System.out.println("Delivery Man Status: " + DMD.get(i).getStatus());
//        System.out.println("==============================================");
//    }
    
    public void Task() {
        c = 0;
        if (c == 0) {
            DMDetails();
            Login();
        } else {
            Login();
        }
    }
    
    private String getDateTime() {
        DateFormat joinDate = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return joinDate.format(date);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        setStatus d = new setStatus();
        d.Task();
    }
}
