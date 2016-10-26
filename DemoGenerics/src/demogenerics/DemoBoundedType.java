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
import java.util.List;
//to test if any item in the list is greater than ...
public class DemoBoundedType {
   //T has already implemented (or of type) interface Comparable by follwing type declaration
    public static <T extends Comparable<T>> boolean test(List<T> lst, T e) {
        for (T temp : lst){
            if (temp.compareTo(e)>0)
                return true;
        }
        return false;
    }
}
