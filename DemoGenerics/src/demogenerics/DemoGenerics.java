/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogenerics;

/**
 *
 * @author helen
 * @param <T>
 */
public class DemoGenerics<T> {

    /**
     * @return 
     */
    public static DemoGenerics createIt(){
        DemoGenerics tst = new DemoGenerics();
        return tst;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DemoGenerics<Integer> myTst= new DemoGenerics<>();
        
        myTst = createIt();
    }
    
}
