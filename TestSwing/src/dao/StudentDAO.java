/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.xml.internal.bind.v2.model.core.Adapter;
import dto.Student1;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StudentDAO{
    ArrayList<Student1> dsSinhvien;

    public StudentDAO() {
        
        dsSinhvien = new ArrayList<>();
        Student1 s1 = new Student1(1,"luong",1);
        Student1 s2 = new Student1(2,"long",1);
        Student1 s3 = new Student1(3,"lanh",0);
        dsSinhvien.add(s1);
        dsSinhvien.add(s2);
        dsSinhvien.add(s3);
        
    }
    public void Create( Student1 s)
    {
    dsSinhvien.add(s);
    
    }
    public String[] Read(){
    String str[]= new String[dsSinhvien.size()];
    for (int i=0; i<dsSinhvien.size();i++){
            Student1 s = dsSinhvien.get(i);
        str[i] += s.getCode()+"\t"+s.getName()+"\t"+s.getGender()+"\n";
    }
    return str;
    }
    
    public boolean Update(Student1 s){
    for (int i=0; i<dsSinhvien.size(); i++)
        if (dsSinhvien.get(i).getCode() == s.getCode()){
        dsSinhvien.set(i, s);
        return true;
        }
    return false;
    }
    public boolean Delete(int code){
    for (int i=0; i<dsSinhvien.size(); i++)
        if (dsSinhvien.get(i).getCode() == code){
        dsSinhvien.remove(i);
        return true;
        }
    return false;
    }

    
    
    public ArrayList<Student1> getDsSinhvien() {
        return dsSinhvien;
    }

    public void setDsSinhvien(ArrayList<Student1> dsSinhvien) {
        this.dsSinhvien = dsSinhvien;
    }

   
    
    
}
