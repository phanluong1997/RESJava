/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;

/**
 *
 * @author Admin
 */
public interface ProductInterface {
    
   
   public Product add();
   public void display(Product p);
   public float getTotal(Product[]list,int n);
   public int findProduct(Product[]list,int n, int id);
   public boolean update(int id, Product[] list, int n);
   
   
    
    
    
}
