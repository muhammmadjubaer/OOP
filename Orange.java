
package com.mycompany.oopassignment;
   
    public class Orange extends Fruit
{
       String taste = "extra sour";
    
    @Override
    
    public void eat()
    {
        System.out.println("Taste is : "+taste);
    }
    
    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.eat();
    }
}
  
