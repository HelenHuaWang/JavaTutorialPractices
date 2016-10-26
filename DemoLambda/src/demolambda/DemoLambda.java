/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demolambda;

/**
 *
 * @author helen
 */
public class DemoLambda {

    /**
     * @param args the command line arguments
     */
    interface calInt {
        int calInteger(int a, int b);
    }
           
    int doCal(int a, int b, calInt calculator){
        return calculator.calInteger(a, b);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DemoLambda test = new DemoLambda();
        calInt add=(a,b)->a+b;
        calInt sub=(a,b)->a-b;
        System.out.println("add is " + test.doCal(20, 10, add));
    }
    
}
