/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoinstance1;

/**
 *
 * @author helen
 */
public class DemoInstance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a
         Parent obj1 = new Parent();
        Parent obj2 = new Child();
            System.out.println("obj1 is instance of Parent: " + (obj1 instanceof Parent));
            System.out.println("obj1 is instance of Child: " + (obj1 instanceof Child));
            System.out.println("obj1 is instance of MyInterface: " + (obj1 instanceof MyInterface));

            System.out.println("obj2 is instance of Parent: " + (obj2 instanceof Parent));
            System.out.println("obj2 is instance of Child: " + (obj2 instanceof Child));
            System.out.println("obj2 is instance of MyInterface: " + (obj2 instanceof MyInterface));

    
    }
}
  
     interface MyInterface{}
    class Parent implements MyInterface{}
    class Child extends Parent{}

  
