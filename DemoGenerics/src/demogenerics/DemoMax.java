/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogenerics;
import java.util.Comparator;
import java.util.*; 
//OR import both:
//import java.util.List;
//import java.util.ArrayList;
/**
 *
 * @author helen
 */
//NEED to cast cmprtr to the sort() type//
public class DemoMax {
    /*one solution; need to cast cmprtr to (Comparator<? super T>)
    /*public static <T> T toFindMax(List<T> lst, int i, int j, Comparable<T> cmprtr){
        lst.subList(i, j).sort((Comparator<? super T>) cmprtr);
        return lst.get(j-i);
    }*/
       
    public static <T extends Comparator<T>> T findMax(List<T> lst, int begin, int end){
        int max=begin; int next = begin+1;
        //List<T> subLst = lst.subList(begin, end);
        while (begin<end){
            if(lst.get(max).compare(lst.get(max), lst.get(next))>0){
            } else {
                max=next;
            }
            next++;
        }
        return lst.get(max);
    }
    /*public static <T> T toFindMax(List<T> lst, int i, int j){
        Comparator<? super T> temp=(Comparator<? super T>)(lst.subList(i, j));
        Collections.sort((Comparator<? super T>)temp));
        return temp.get(j-i);
    }*/
    public static void main(String[] args){
       
        List myLst = new ArrayList();
        for(int i=0; i<5; i++){
            myLst.add(10-i);
        }
       // int tst = findMax(myLst, 1,4);
        /*
        Collections.sort(myLst);
        myLst.forEach(System.out::println);
        //toFindMax(myLst, 1,4, a->());*/
        
    }
}
