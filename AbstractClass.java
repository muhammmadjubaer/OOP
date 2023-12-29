
package com.mycompany.oopassignment;

/**
 *
 * @author Fahim-al-jubaer
 */

   
abstract class Shape {
    
    int x, y;
    abstract void printArea();

}

class Rectangle extends Shape {

    @Override
    void printArea() {
        double area = x*y;
        System.out.println("The Area of rectangle is  = "+area);
    }
    
}

class Triangle extends Shape {
    
    @Override
    void printArea() {
        double area = 0.5*x*y;
        System.out.println("The Area of triangle is  = "+area);
    }
}

class Circle extends Shape {
    
    @Override
    void printArea() {
        double area = 3.1416*x*x;
        System.out.println("The Area of circle is  = "+area);
    }
}

  public class AbstractClass {
    
        public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        rectangle.x = 12;
        rectangle.y = 14;
        rectangle.printArea();
        
        Triangle triangle = new Triangle();
        triangle.x = 15;
        triangle.y = 10;
        triangle.printArea();
        
        Circle circle = new Circle();
        circle.x = 5;
        circle.printArea();
        
        
    }
}  
    

