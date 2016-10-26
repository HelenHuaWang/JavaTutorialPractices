/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonestclass;

/**
 *
 * @author helen
 */
public class DemoNestClass {

    /**
     * @param args the command line arguments
     */
    private int test = 1;
    class InnerTest{
        int test = 2; 
        void printInner(int test){
            System.out.println("local from Inner is: "+ test);
            System.out.println("inner member from Inner is: "+ this.test);
            DemoNestClass.this.test=199;
            System.out.println("Outer member from Inner is: "+DemoNestClass.this.test);
        }
    }
    void printOuter(int test){
        System.out.println("local from outer is: "+ test);
       
        System.out.println("inner member from outer is: "+ (new InnerTest().test));
        System.out.println("outer member from outer is: "+ this.test);


    }
    public static void main(String[] args) {
        // TODO code application logic here
        DemoNestClass demoOuter= new DemoNestClass();
        DemoNestClass.InnerTest demoInner = demoOuter.new InnerTest();
        demoInner.printInner(9);
        demoOuter.printOuter(7);
        
    }
    
}
