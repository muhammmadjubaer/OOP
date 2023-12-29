package com.mycompany.oopassignment;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseEvent implements MouseListener{


   JFrame frame = new JFrame();
   Container pane = frame.getContentPane();


   MouseEvent(){
       pane.addMouseListener(this);


       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(375,450);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
   }


   public void mouseClicked(MouseEvent e) {


       int x = e.getClickCount();
       System.out.println("You CLICKED the mouse " + x + " times.");
   }


   public void mouseEntered(MouseEvent e) {
       pane.setBackground(Color.YELLOW);
   }


   public void mouseExited(MouseEvent e) {
       pane.setBackground(Color.MAGENTA);
   }


   public void mousePressed(MouseEvent e) {
       System.out.println("You have PRESSED the mouse");
   }


   public void mouseReleased(MouseEvent e) {


       int a = e.getX();
       int b = e.getY();
       System.out.println("You have RELEASED the mouse at (" + a + "," + b + ") - (X,Y)");
   }
     
   public static void main(String args[]){
      
       new MouseListenerHandler();
  
   }
}