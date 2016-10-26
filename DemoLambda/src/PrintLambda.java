/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helen
 */
import java.util.function.Function;
//import java.lang.Integer;

public class PrintLambda {
    private final static int SIZE = 15;
    final int[] arrayInt;
    //constructor
    public PrintLambda(){
        arrayInt = new int[SIZE];
        for (int i=0; i<SIZE; i++){
            arrayInt[i] = i;
        }
    }
    //toprint method that takes the function interface instance

    /**
     *
     * @param index
     * @param func
     * @return 
     */
    public boolean toPrint(int index, Function<Integer, Boolean> func){
        //boolean testBoo = (Boolean) func.apply(index);
        return (func.apply(index)); 
    }
    //main(): to pass in data and toPrint to print 
    // with lambda to define whether print odd or even 
    public static void main(String[] args){
        PrintLambda tester = new PrintLambda();
       
//declaration lambda here; print even
       // Function<Integer, Boolean> isOdd= ((Integer)a, (Boolean)b)->{return (new Boolean(a%2));};
        Function<Integer,Boolean> isOdd = (a)->(a%2!=0);
        Function<Integer,Boolean> isEven = (a)->(a%2==0);

        //tester to print odd
        for (int i = 0; i < SIZE; i++){
            if (tester.toPrint(i, isOdd) ){
                System.out.println(tester.arrayInt[i]);
            }
        }
        //tester to print even 
        for (int i = 0; i < SIZE; i++) {
            if (tester.toPrint(i, isEven) ){
                System.out.println(tester.arrayInt[i]);
            }
        }
    }
}  
