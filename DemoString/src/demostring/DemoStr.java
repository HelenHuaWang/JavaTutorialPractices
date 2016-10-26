package demostring;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helen
 */
public class DemoStr {
    
    public static void main(String[] args){
        StringBuilder tst= new StringBuilder("thisTest");
        System.out.println(tst.length());
        System.out.println(tst.capacity());
        
        
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah.charAt(15));
        
        String hi = "Hi, ";
        String mom = "mom.";
        String cat=hi+mom;
        String catit=hi.concat(mom);
        System.out.println(cat);
        
        //get my initial
        String initial; 
        String fullName = "hua wang";
        char initFirst = fullName.charAt(0);
        char initLast = fullName.charAt(fullName.lastIndexOf(' ')+1);
        initial = Character.toString(initFirst) + Character.toString(initLast);
        System.out.println(initial);
        
        
        

    }
}
