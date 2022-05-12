/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ATM {
    private String id;
    private int sodu, amount;
    
    Scanner s = new Scanner(System.in);
    public void inPut(){
   // Scanner s = new Scanner(System.in);
        System.out.println("Nhap");
        sodu = s.nextInt();
        id = s.nextLine();
            
    }
    public void withDraw(){
       System.out.println("Nhap so tien muon rut");
       amount = s.nextInt();
        if(amount<=sodu)
                {

                     sodu= sodu- amount;
                }
        else if (amount>=sodu)
        {
            System.out.println("loi");
        }
    
    }
    public void displayBalance(){
        System.out.println(+sodu);
    }
  
  
    public static void main(String[] args) {
        ATM a = new ATM();
        a.inPut();
        a.withDraw();
        a.displayBalance();
    }
    
}
