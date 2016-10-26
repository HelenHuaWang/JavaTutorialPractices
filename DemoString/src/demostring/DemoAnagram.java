/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostring;
import java.util.ArrayList;

/**
 *
 * @author helen
 */
//if two diff words (or phrase) have the same length and same set of letters
//only letters, put to arrayList; sort() and equals()
public class DemoAnagram {
    private String word1, word2;
    public DemoAnagram(String wd1, String wd2){
        if ((wd1==null)||(wd2==null)) return;
        word1=wd1;
        word2=wd2;
    }
    public ArrayList toGetLetters(String str){
        ArrayList lst= new ArrayList(str.length());
        
        for (int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(!lst.add(str.charAt(i))){
                    System.out.println("ArrayList add() failed at string "+str+
                            " index "+i);
                    return null;
                }
            }
        }
        return lst;
    }
    public void toSort(ArrayList lst){
        lst.sort(null);
    }
    public boolean toCompare(ArrayList lst1, ArrayList lst2){
        return (lst1.equals(lst2));
    }
    
    public static void main(String[] args){
        String one="I am one";
        String two="Iam one!!";
        DemoAnagram demo = new DemoAnagram(one, two);
        ArrayList onelst = demo.toGetLetters(one);
        ArrayList twolst = demo.toGetLetters(two);
        demo.toSort(onelst);
        demo.toSort(twolst);
        if(demo.toCompare(onelst, twolst)==true){
            System.out.println("yes, these two strings are ...");
        } else {
            System.out.println("they are not");
        }
    }
}
