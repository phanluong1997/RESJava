/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.StudentDAO;
import dto.Student;
import java.util.Scanner;

/**
 *
 * @author BIM10-SAGER
 */
public class TestSQL {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.readAll();
        dao.display();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần cập nhật: ");
        int masv = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập họ mới: ");
        String ho = sc.nextLine();
        System.out.print("Nhập tên mới: ");
        String ten = sc.nextLine();
        
        Student s = new Student();
        s.setHo(ho); s.setTen(ten); s.setMasv(masv);
        
        dao.update(s);
        dao.readAll();
        dao.display();
    }
}
