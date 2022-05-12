/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.ProductDAO;
import entity.Product;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ProductManage {
     Product[]list;
    int n;
    int max;

    public ProductManage() {
        max = 10;
        list = new Product [max];
        list[0] =new Product(1,"SP1",10,1,543f);
        list[0] =new Product(1,"SP2",20,2,533f);
        list[0] =new Product(1,"SP3",30,3,543f);
        n=3;
        
    }
    

    public Product[] getList() {
        return list;
    }

    public void setList(Product[] list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    
     public static void main(String[] args) {
         
        ProductManage pm = new  ProductManage();
         
         
         ProductDAO dao = new ProductDAO();
         dao.add();
         
         
      
        
    }
    
}
