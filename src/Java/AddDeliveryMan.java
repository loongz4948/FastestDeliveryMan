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

/**
 *
 * @author taruc
 */
public class AddDeliveryMan {
    Scanner sc = new Scanner(System.in);
    ArrayList<AddFunction> add = new ArrayList<>();
    int i;
    int c;
    String input;
    int id = 1000;
    
    public void AddDetails(){
        add.add(new AddFunction("",id,"","","","",""));
        add.add(new AddFunction("",id,"","","","",""));
        add.add(new AddFunction("",id,"","","","",""));
        add.add(new AddFunction("",id,"","","","",""));
    }
    
    public void Run() {
        c = 0;
        if (c == 0) {
            AddDetails();
            AddDM();
        } else {
            AddDM();
        }
    }
    
    public void AddDM(){
        id++;
            System.out.println("ID :"+ id);
            System.out.print("Name(a-z/A-z):");
            String name = sc.nextLine();
            add.get(i).setDmName(name);
            System.out.print("Gender(M/F):" );
            String gender = sc.nextLine();
            add.get(i).setDmGender(gender);
            System.out.print("IC Number(xxxxxx-xx-xxxx):" );
            String ic = sc.nextLine();
            add.get(i).setDmIC(ic);
            System.out.print("H/P Number(xxx-xxxxxxx):" );
            String hp = sc.nextLine();
            add.get(i).setDmHP(hp);
            System.out.print("Email(@hotmail.com):"  );
            String email = sc.nextLine();
            add.get(i).setDmEmail(email);
            System.out.print("Address(a-z/A-z):"  );
            String address = sc.nextLine();
            add.get(i).setDmAddress(address);
            System.out.println();
            
            confirm();
            System.out.println("Add Successfull");
            resume();
        
            
    }
    
    public void print(){
        System.out.println("ID :"+ id);
            System.out.println("Name(a-z/A-z):" + add.get(i).getDmName());
            System.out.println("Gender(M/F):" + add.get(i).getDmGender());
            System.out.println("IC Number(xxxxxx-xx-xxxx):" + add.get(i).getDmIC());
            System.out.println("H/P Number(xxx-xxxxxxx):" + add.get(i).getDmHP());
            System.out.println("Email(@hotmail.com):" + add.get(i).getDmEmail());
            System.out.println("Address(a-z/A-z):" + add.get(i).getDmAddress());
    }
   
    public void resume() {
        System.out.println("");
        System.out.print("Do You want to Add again? (Y/N)");
        input = sc.nextLine();
            if(input.equals("Y")){
                System.out.println("");
                AddDM();
            }else if (input.equals("N")){
                System.out.println("Thanks for using our system~");
                System.out.println("");          
            }else{
                System.out.println("Invalid input! (Y/N)");
                System.out.println("");
                resume();
            }
        
    }
    
        public void confirm() {
        System.out.println("");
        System.out.println("Confirm? (Y/N) ");
        input = sc.nextLine();
            if(input.equals("Y")){
                System.out.println("");
                print();
            }else if (input.equals("N")){
                AddDM();          
            }else{
                System.out.println("Invalid input! (Y/N)");
                System.out.println("");
                confirm();
            }
        
    }

    public static void main(String[] args) {
        AddDeliveryMan aDM = new AddDeliveryMan();
        aDM.Run();
    }
}

                 

