/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

/**
 *
 * @author helen
 */
public class DemoInterfaceClass implements DemoInterface{
    static void print(){
        System.out.println("just test in this class");
    }
    void myTest(){
        System.out.println("myTest in class");
    }
    public static void main(String[] args){
        DemoInterfaceClass testClass=new DemoInterfaceClass();
        DemoInterface.myTest();//you can use the interface name to invoke the static method
        //but not if you override in the class; as if not defined in class
        testClass.myTest();//if remove static; diff method now
        DemoInterfaceClass.print();//statis method cannot be invoked on instance
    }
}
