/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonumbers;

/**
 *
 * @author helen
 */
public class DemoMinValue {
    
    public static void main(String args[]) {
 
        //integers
        byte largestByte = Byte.MAX_VALUE;
        byte smallestB= Byte.MIN_VALUE;
        short largestShort = Short.MAX_VALUE;
        short smallestS=Short.MIN_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;
 
        //real numbers
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;
 
        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;
 
        //Display them all.
        System.out.println("The largest byte value is "
                           + largestByte + ".");
        System.out.println("The largest byte value is "
                           + smallestB + ".");
        System.out.println("The largest short value is "
                           + largestShort + ".");
         System.out.println("The largest short value is "
                           + smallestS + ".");
        System.out.println("The largest integer value is "
                           + largestInteger + ".");
        System.out.println("The largest long value is "
                           + largestLong + ".");
 
        System.out.println("The largest float value is "
                           + largestFloat + ".");
        System.out.println("The largest double value is "
                           + largestDouble + ".");
 
        if (Character.isUpperCase(aChar)) {
            System.out.println("The character " + aChar
                               + " is uppercase.");
        } else {
            System.out.println("The character " + aChar
                               + " is lowercase.");
        }
        System.out.println("The value of aBoolean is "
                           + aBoolean + ".");
        
        if(args.length<3){
            System.out.println("not enough args"); 
            return;
        } 
        int total=0;
        for (String arg:args){
            total+=Integer.valueOf(arg); 
        }
        System.out.println(total);
        
    }
}