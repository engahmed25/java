
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *\
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author Mcs
 */
 



public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
   
   public static void main(String[] args) {
 
 
   
   //Circle9 xcv = new Circle9();
   
double i = 3;
//int bnm =3.5;
    Scanner s = new Scanner(System.in);  
    //String vvv = s.next();
        System.out.println('A'+1);
        System.out.println(Math.round(1.5)/Math.rint(2.5)*Math.round(3.14));
        //System.out.println(new Integer(335).compareTo(new Integer(335555)));
        System.out.println("Ab".compareTo("Al"));
        java.util.Date date1 = new java.util.Date(2013 , 1, 13);
 java.util.Date date2 = new java.util.Date(2013, 1, 15);
 //System.out.println(date1.compareTo(date2));   
   }
   }
abstract class GeometricObject {
 protected GeometricObject() {
 System.out.print("A");
 }
 protected GeometricObject(String color, boolean filled) {
 System.out.print("B");
 }
 }
 class Circle9 extends GeometricObject {
 /** No-arg constructor */
 public Circle9() {
 this(1.0);
 System.out.print("C");
 }
 /** Construct circle with a specified radius */
 public Circle9(double radius) {
 this(radius, "white", false);
 System.out.print("D");
 }
 /** Construct a circle with specified radius, filled, and color */
 public Circle9(double radius, String color, boolean filled) {
 super(color, filled);
 System.out.print("E");
 }
 }
  