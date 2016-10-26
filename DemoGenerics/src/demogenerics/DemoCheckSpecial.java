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
/* java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.*;
*/
import java.util.*;
import java.util.function.*;

//used lambda/method reference 
public class DemoCheckSpecial {
    static int cnt = 0;
    public static <T> int toTest(Collection<T> lst, Predicate<T> prd){
        for (T temp: lst){
            if (prd.test(temp)){
                cnt++;
            }
        }
        return cnt; 
    }
    public static void main(String[] args){
        List<Integer> lst = new ArrayList<>();
        for (int i=0; i<5; i++)
            lst.add(i);
        System.out.println("The count of int is even num is: " + toTest(lst, a->a%2==0));
    }
}
