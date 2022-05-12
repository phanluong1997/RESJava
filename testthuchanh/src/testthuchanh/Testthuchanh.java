/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthuchanh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Testthuchanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tu nhien: ");
        int n = scanner.nextInt();
        int soDN= 0;
        int tam;
        int dvi;
       tam =n;
        while (tam!=0 )
        {
            dvi =tam%10;
            soDN = soDN*10+dvi;
            tam=tam/10;
            
        }
        System.out.println(""+tam);
        if(soDN == n)
        {
            System.out.println(n+": la so doi xung");
        }
        else
        {
            System.out.println(n+": khong la so doi xung");
        }
        scanner.close();
     }
    
}
