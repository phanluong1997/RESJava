/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rect;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Rect {
    
    private double width, height;
    
    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ");
        width = scanner.nextDouble();
        height = scanner.nextDouble();
        
    }
    public void disPlay() {
    
        System.out.println(+height);
        System.out.println(+width);
     
        double chuvi  = (height+width)*2;
              System.out.println("chu vi: "+chuvi);
        
       
       double dt= height*width;
        System.out.println("dien tich: "+dt);
        
        return ;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rect s1 = new Rect();
        s1.inPut();
        s1.disPlay();
        
    }
    
}
