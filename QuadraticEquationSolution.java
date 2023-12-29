
package com.mycompany.oopassignment;

import java.util.Scanner;

public class QuadraticEquationSolution {

  public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      double a,b,c,discriminant;
      System.out.println("Enter the co-efficient of x^2 : ");      
      a = scanner.nextDouble();
      System.out.println("Enter the co-efficient of x : ");
      b = scanner.nextDouble();
      System.out.println("Enter the constant : ");
      c = scanner.nextDouble();
      
      discriminant = Math.pow(b, 2)-(4*a*c);
      
      double root1,root2;
      
      if(discriminant == 0)
      {
          System.out.println("There exists real and equal roots.");
          root1 = root2 =  -b/(2*a); 
          System.out.println("Solutions are : x1= " + root1 + " and x2 = " + root2);
      }
      else if(discriminant > 0)
      {
          System.out.println("There exists real and unequal roots.");
          root1= (-b+Math.sqrt(discriminant))/2*a;
          root2= (-b-Math.sqrt(discriminant))/2*a;
          System.out.println("Solutions are : x1= " + root1 + "and x2 = " + root2);
      }
      else
      {
          System.out.println("There exists imaginary roots.");
          double real = (-b/2*a);
          double imaginary = (Math.sqrt(-discriminant))/2*a;
          System.out.println("Solutions are : x1= " + real + "  + i " + imaginary);
          System.out.println("Solutions are : x2= " + real + "  - i " + imaginary);
      }
  }
}
