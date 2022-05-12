/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    private String name;
    private int age;
    private float math, van;
    
    public void inPut(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Nhap");
        
        name = scan.nextLine();
        age = scan.nextInt();
        math = scan.nextFloat();
        van = scan.nextFloat();
        
    
    }
    public void displayResult(){
         float dk = (math*2+van)/3;
         if (dk >=5)
         {
             System.out.println("Dau");
         }
         else
         {
             System.out.println("Rot");
         }
    
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inPut();
        s1.displayResult();
    }
    
}
