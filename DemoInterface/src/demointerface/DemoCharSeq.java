/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;

import java.util.Arrays;

/**
 *
 * @author helen
 */
//char[]: 
public class DemoCharSeq implements CharSequence
{
    private char[] myChar;
    private int size; 
    public static final int INITIALSIZE=10;
    //constructor
    public DemoCharSeq(String sInit){
        myChar = sInit.toCharArray();
    }
    public DemoCharSeq(char[] cInit){
        myChar = new char[cInit.length];
        myChar=cInit;
    }
    public DemoCharSeq(){
        myChar = new char[]{'t','e', 's','t'};
        //OK char[] myChar={'t'};
        //!OK myChar={'t'};
    }
    //read in char seq and return backwards
    //here input is this obj
    public String backStr(){
        char[] temp = new char[this.length()];

        for (int i=0; i<this.length(); i++){
            temp[i]=this.charAt(this.length()-i-1);
        }
        return new String(temp);
    }
    //all implementation need to change to add in "public"
    @Override
    public int length(){
        return myChar.length;
    }
    @Override
    public CharSequence subSequence(int start, int end){
        String charSeq = new String(Arrays.copyOfRange(myChar, start, end));
        return charSeq;
    }
    @Override
    public String toString(){
        return new String(myChar);
    }
    @Override
    public char charAt(int index){
        return myChar[index];
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        DemoCharSeq test=new DemoCharSeq();
        String back=test.backStr();
        System.out.print(test);
        System.out.println();
        System.out.println(back);
    }
}
