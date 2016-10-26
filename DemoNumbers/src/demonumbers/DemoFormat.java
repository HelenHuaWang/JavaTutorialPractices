package demonumbers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helen
 */
import java.text.DecimalFormat;
import java.lang.Integer;

public class DemoFormat {

    /**
     *
     * @param pattern
     * @param input
     */
    public static void myPrint(String pattern, double input){
        DecimalFormat  myFormat = new DecimalFormat(pattern);
        System.out.println(myFormat.format(input));
    }
    public static void main(String[] args){
        myPrint("###,###", 1234567);
        
        //other tests
        for (String arg : args) {
            System.out.println(Integer.toHexString(Integer.valueOf(arg)));
        }
        System.out.println(Integer.valueOf("230", 5));
        System.out.println(Double.isNaN(123.4567));
        System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
    }
}
