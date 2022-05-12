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
public class Test {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c4 = new Circle();  
        rectangle a = new rectangle();
        Square hv = new Square();
        hv.setLenght(5.0);
        hv.setWidth(5.0);
        hv.getArea();
        hv.getPerimeter();
        System.out.println("hv is: " +hv.getLenght());
        System.out.println("Area is: " +hv.getArea() );
       
c4.setRadius(5.0);    
c4.setColor("red");
c4.getArea();
c4.getPerimeter();
System.out.println("radius is: " + c4.getRadius());

System.out.println("color is: " + c4.getColor());   

System.out.println("Area is: " +c4.getArea() );
System.out.println("Perimeter is: " + c4.getPerimeter());


   


    }
}
