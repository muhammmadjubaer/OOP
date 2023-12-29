
package com.mycompany.oopassignment;

public class ImplementInterfaceUsingExtendKeyword {

interface Polygon {
  void getArea(int length, int breadth);
}


interface Perimeter extends Polygon
{
    void circumfurance();
}


class Main {
  public static void main(String[] args) {
    
  }
}
 
}
