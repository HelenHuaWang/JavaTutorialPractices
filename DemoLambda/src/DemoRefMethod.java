
import java.util.function.Function;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author helen
 */
public class DemoRefMethod {
    private final static int SIZE = 15;
    private final int[] arrayInt;
    //constructor
    public DemoRefMethod(){
        arrayInt = new int[SIZE];
        for (int i=0; i<SIZE; i++){
            arrayInt[i] = i;
        }
    }
    //put lambda declaration content here instead
    public static Boolean isOddIndex(Integer index){
        if (index%2!=0) return Boolean.TRUE;
        else return Boolean.FALSE;
    }

    public static Boolean isEvenIndex(Integer index){
        if (index%2==0) return Boolean.TRUE;
        else return Boolean.FALSE;
    }
    //pass in diff lambda(class method) here 
    public void toPrint(Function<Integer, Boolean> func){
        for (int i=0; i<SIZE; i++){
            if(func.apply(i)){
                System.out.println(arrayInt[i]);
            } 
        }
    }
   
    public static void main(String[] args){
        DemoRefMethod tester = new DemoRefMethod();
     
        tester.toPrint(DemoRefMethod::isOddIndex);
        tester.toPrint(DemoRefMethod::isEvenIndex);
    }
}  