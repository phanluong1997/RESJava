/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProductDAO implements ProductInterface{

    Scanner s = new Scanner(System.in);
    @Override
    public Product add() {
        System.out.println("THÊM SẢN PHẨM MỚI");
        System.out.println("Ma san pham ");
        int id = s.nextInt();
        System.out.println("Ten san Pham");
        String name = s.nextLine();
        System.out.println("So luong ");
        int quantity = s.nextInt();
        System.out.println("Gia ");
        float price = s.nextFloat();
        
        Product p = new Product (id,name,quantity,price);
        
        return p;
        
      
    }

    @Override
    public void display(Product p) {
        System.out.println("IN THONG TIN SAN PHAM ");
        System.out.println("MA SAN PHAM  "+p.getId());
        System.out.println("TEN SAN PHAM"+p.getName());
        System.out.println("SO LUONG "+p.quantity);
        System.out.println("DON GIA "+p.price);
        System.out.println("THANH TIEN "+(p.quantity*p.price));
        
        
    }

    @Override
    public float getTotal(Product[] list, int n) {
        float total = 0;
        for (int i=0; i<n ; i++)
        total+=list[i].quantity* list[i].price;
        return total;
    }

    @Override
    public int findProduct(Product[] list, int n, int id) {
        for(int i=0; i<n; i++)
            if(list[i].getId()==id)
                return i ;
       return -1;
    }

    @Override
    public boolean update(int id, Product[] list, int n) {
        int index = findProduct(list, n, id);
        if (index ==-1)
            return false;
        System.out.println("  Cập nhật giá sản phẩm  ");
        System.out.println("Nhập số lượng  mới");
        list[index].price = s.nextFloat();
        return true;
    }

   

    
     
    
    
}
