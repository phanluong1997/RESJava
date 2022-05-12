/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
       public  int namSinh;
       public  String id;
       public  double mon1,mon2,mon3;

    public SinhVien() {
    }

    public SinhVien(int namSinh, String id, double mon1, double mon2, double mon3) {
        this.namSinh = namSinh;
        this.id = id;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public double getMon3() {
        return mon3;
    }

    public void setMon3(double mon3) {
        this.mon3 = mon3;
    }
       
       
         
         
    public void xinChao(){
        System.out.println("Xin Chao. Tôi là Sinh viên");
        
    }
    public int tinhTuoi(){
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Nhap nam sinh: ");
      // namSinh = scanner.nextInt();
         int tuoi = 2019 - namSinh;
       
             return tuoi;
    }
    
    public double diemTB(){
       // Scanner scanner = new Scanner(System.in);
        System.out.println("diem tb cac mon: ");
//       mon1 = scanner.nextInt();
//       mon2 = scanner.nextInt();
//       mon3 = scanner.nextInt();
       
       double diemtb = (mon1 + mon2+ mon3)/3;
       return diemtb;
    }
    
    
}
