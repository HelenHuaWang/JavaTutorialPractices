/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlass;

/**
 *
 * @author helen
 */

public class DemoSubClass extends DemoClass{
    String subClas; 
    public DemoSubClass(int a, int b, String t){
       super(a, b);
       subClas = t;
    }
    
   /* public static void main(String[] args){
        String test = "testtest";
        changIt(test);
        System.out.println("the output is " + test);
        test = "another test";
        System.out.println("the another test is "+ test);
    }*/
    public static void changIt(String testIt){
        
        testIt = "my test string";
        System.out.println("the inner printout: " + testIt);
    }

}
