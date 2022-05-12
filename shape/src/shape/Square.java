/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Admin
 */
public class Square extends rectangle {

    public Square() {
    }
    
    public Square(double side) {
   super(side, side);  
}

    @Override
    public double getArea() {
        return super.getArea(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getLenght() {
        return super.getLenght(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getWidth() {
        return super.getWidth(); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


   
    
}
