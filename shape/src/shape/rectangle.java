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
public class rectangle extends Shape{
    private double width,lenght;

    public rectangle() {
    }

    public rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
     public double getArea() {
      return width*lenght;
   }
    public double getPerimeter(){
    return  (width+lenght)*2;
    }

    @Override
    public String toString() {
        return "rectangle{" + "width=" + width + ", lenght=" + lenght + '}';
    }
    
    
}
