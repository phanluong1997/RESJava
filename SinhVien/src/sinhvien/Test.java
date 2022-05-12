/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        
        SinhVien s1 = new SinhVien(1997,"luong",7.0,8.0,10.0);
       
        s1.setMon1(10.0);
        s1.setMon2(10.0);
        
       s1.xinChao();
       
       
       System.out.println(+s1.tinhTuoi());
       System.out.println(+s1.diemTB());
    }

    
}
