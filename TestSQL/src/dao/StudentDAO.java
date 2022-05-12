/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DBConnection;

/**
 *
 * @author BIM10-SAGER
 */
public class StudentDAO {
    Connection con;
    DBConnection dbc = new DBConnection();
    ResultSet rs;
    ArrayList<Student> list = new ArrayList<>();

    public ArrayList<Student> getList() {
        return list;
    }
    
    public void readAll() {
        list = new ArrayList<>();
        con = dbc.openConnection();
        try {
            rs = con.createStatement().executeQuery("SELECT * FROM sinhvien");
            while (rs.next()) {
                Student s = new Student();
                s.setMasv(rs.getInt("masv"));
                s.setHo(rs.getNString("ho"));
                s.setTen(rs.getNString("ten"));
                s.setNamSinh(rs.getInt("namsinh"));
                s.setGioiTinh(rs.getString("gioitinh"));
                
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        dbc.closeConnection();
    }
    
    public void update(Student s)
    {
        con = dbc.openConnection();
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE sinhvien SET ho = ?, ten = ? WHERE masv = ?");
            ps.setNString(1, s.getHo());
            ps.setNString(2, s.getTen());
            ps.setInt(3, s.getMasv());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        dbc.closeConnection();
    }
    
    public void display() {
        for (Student s : list) {
            System.out.println(s.getHo() + " " + s.getTen());
        }
    }
}
