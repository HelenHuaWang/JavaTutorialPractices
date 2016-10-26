/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogenerics;

/**
 *
 * @author helen
 */
public class DemoExchArr {
    public static <T> void toExchange(T[] t, int i, int j){
        T temp= t[i];
        t[i]=t[j];
        t[j]=temp;
    }
}
