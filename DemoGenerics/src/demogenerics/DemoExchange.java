/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogenerics;
import java.util.*;

/**
 *
 * @author helen
 */
public class DemoExchange {
    public static <T> void toExchange (List<T> lst, int indexOne, int indexTwo){
        T temp = lst.get(indexTwo);
        lst.set(indexTwo, lst.get(indexOne));
        lst.set(indexOne, temp);
    }
    
    public static void main(String[] args){
        //char[] tst = {'a','b'};
        List lst = new ArrayList();
        if (!lst.add('a')) return;
        if (!lst.add('b')) return;
        toExchange(lst, 0, 1);
        lst.forEach(System.out::println);
    }
}
