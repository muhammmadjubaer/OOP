
package com.mycompany.oopassignment;

public class Apple extends Fruit {
    
   String taste = "sour";
    
    @Override
    
    public void eat()
    {
        System.out.println("Taste is : "+taste);
    }
    
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eat();
    }
    
}

