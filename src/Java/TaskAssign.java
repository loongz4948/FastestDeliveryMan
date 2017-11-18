/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import Domain.DeliveryManDetails;
import Domain.OrderDetails;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TaskAssign {
    
    Scanner scan = new Scanner(System.in);
    ArrayList<OrderDetails> od = new ArrayList<>();
    ArrayList<DeliveryManDetails> dm = new ArrayList<>();
    String Status = "On Delivery";
    String userInput;
    int i;
    int c;
    int EDMcount = 0;
    int EOcount = 0;

    public void OrderDetails(){
        od.add(new OrderDetails("111-111-111","Best Television","Television","2",2000.00));
        od.add(new OrderDetails("222-222-222","Best Laptop","Laptop","1",3000.00));
        od.add(new OrderDetails("333-333-333","Best Mobile Phone","Mobile Phone","3",1000.00));
        od.add(new OrderDetails("444-444-444","Best Game Console","PS4","1",1500.00));
        od.add(new OrderDetails("555-555-555","Best Printer","Printer","2",1250.00));
    }
    
    public void DMDetails(){
        dm.add(new DeliveryManDetails(1001,"Available"));
        dm.add(new DeliveryManDetails(1002,"Available"));
        dm.add(new DeliveryManDetails(1003,"On Delivery"));
        dm.add(new DeliveryManDetails(1004,"Available"));
        dm.add(new DeliveryManDetails(1005,"Available"));
    }
    
    public void Task() {
        c = 0;
        if (c == 0) {
            OrderDetails();
            DMDetails();
            VerifyDM();
        } else {
            VerifyDM();
        }
    }
    
    public void OrderAssign(){
    Queue<Integer> EO = new ArrayBlockingQueue<>(50); 
    int index = 0;
    String updateStatus = "On Delivery";
    for( index = 0 ; index < od.size() ; index++){
        EO.add(od.indexOf(dm.get(index)));
        EOcount++;
    }
    

    Queue<Integer> EDM = new ArrayBlockingQueue<>(50); 
    for( index = 0 ; index < dm.size() ; index++){
            EDM.add(dm.indexOf(dm.get(index)));
            EDMcount++;
       }   
        
        if(!EDM.isEmpty() && !EO.isEmpty()){
                if(dm.get(i).getStatus().equals("Available")){
                    for( index = 0; index < dm.size(); index++){
                        dm.get(i).setStatus(updateStatus);
                        
                    }
                    AssignTask();
                }else{
                    System.out.println("Delivery Man is On Delivery");
                    exit();
                }
        }
//        else if(!EDM.isEmpty() && EO.isEmpty()){
//            System.out.println("No Order Available");
//        }else if (EDM.isEmpty() && !EO.isEmpty()){
//            System.out.println("No Delivery Man Available");
//        }
//        else{
//            if(EDMcount < EOcount){
//                        System.out.println("No Delivery Man Available.");
//                    }
//            if(EOcount < EDMcount){
//                        System.out.println("No Order Available.");
//                    }
//                    exit();
//        }
    }

    public void DMStatus(){
        System.out.println("====================================================");
        System.out.println("Delivery Man Status");
        System.out.println("====================================================");
        for (i = 0; i < dm.size(); i++) {
        System.out.println("ID Number : " + dm.get(i).getDMID());
        System.out.println("Status : " + dm.get(i).getStatus());
        System.out.println("");
        }
        System.out.println("====================================================");
        System.out.println("");
    }
    
    public void VerifyDM(){
        DMStatus();
        System.out.println("----------------------------------------------------");
        System.out.println("Enter DeliveryMan ID");
        System.out.println("Enter 'exit' to cancel Task Assign");
        System.out.println("----------------------------------------------------");
        System.out.print("Enter Delivery men's ID : ");
        userInput = scan.nextLine();
        int count = 0;
        if (userInput.equals("exit")) {
            exit();
        } else {
            for (i = 0; i < dm.size(); i++) {
                if (Integer.parseInt(userInput) == dm.get(i).getDMID()) {
                    OrderAssign();
                    count=1;
                }
                
                }
        
//            }if(Integer.parseInt(userInput) != dm.get(i).getDMID()){
//                    System.out.println("");
//                    System.out.println("****************************************************");
//                    System.out.println("Invalid DeliveryMan ID!!! ");
//                    System.out.println("****************************************************");
//                    System.out.println("");
////                    VerifyDM();
            
            
        }   
    }
    
    public void exit() {
        System.out.println("");
        System.out.println("End Process ");
        System.out.print("Do You want to Verify again? (Y/N)");
        userInput = scan.nextLine();
            if(userInput.equals("Y")){
                System.out.println("");
                VerifyDM();
            }else if (userInput.equals("N")){
                System.out.println("Thanks for using our system~");
                System.out.println("");          
            }else{
                System.out.println("Invalid input! (Y/N)");
                System.out.println("");
                exit();
            }
        
    }
    
    
    public void AssignTask() {
        System.out.println("");
        System.out.println("====================================================");
        System.out.println("Assign Task To Delivery Man");
        System.out.println("====================================================");
        System.out.println("ID Number : " + dm.get(i).getDMID());
        System.out.println("Order ID : " + od.get(i).getOrderID());
        System.out.println("Order Item : " + od.get(i).getOrderItem());
        System.out.println("Order Description : " + od.get(i).getOrderDesc());
        System.out.println("Order Quantity: " + od.get(i).getOrderQuantity());
        System.out.println("Order Price/Quantity : " + od.get(i).getOrderPrice());
        System.out.println("Status : " + dm.get(i).getStatus());
        System.out.println("====================================================");
        System.out.println("");
        exit();

    }
    
//    public static boolean CheckDM(ArrayList dm){
//        if(dm != null)
//    {
//        for(object a : dm)
//            if(a != null) return false;
//    }
//
//    return true;
//    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TaskAssign d = new TaskAssign();
        d.Task();
    }
    
}
