
package com.mycompany.oopassignment;

class Addition
{
    public int addition(int a, int b, int c)
    {
        return a+b+c;
    }
    
    public double addition(double a, double b, double c)
    {
        return a+b+c;
    }
    
    public int addition(int a, int b)
    {
        return a+b;
    }
}



public class MethodOverloading {
    
    public static void main(String[] args) {
        Addition sum = new Addition();
        int result1 = sum.addition(3, 40, 50);
        System.out.println("The result is : "+result1);
        double result2 = sum.addition(2.5, 3.0,4.5);
        System.out.println("The result is : "+result2);
        int result3 = sum.addition(2, 5);
        System.out.println("The result is : "+result3);
    }
}

