/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostring;

/**
 *
 * @author helen
 */
public class DemoString {
    private String fullName;
    private char fileSep;
    private char ext;
    
    public DemoString(String flnm){
        fullName=flnm;  //\/home/user/mytext.txt
        fileSep = '/';
        ext = '.';
    }
    public void setFullNmae(String fullname){
        this.fullName = fullname;
    }
    public String getFullName(){
        return fullName;
    }
    public String getFlNm(){
        int extInd = fullName.lastIndexOf('.');
        int pathInd = fullName.lastIndexOf('/');
        String subStr=fullName.substring(pathInd+1, extInd);
        return subStr;
    }
    /*public String getPath(){
        
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoString newObj = new DemoString("/home/test/test.txt");
        System.out.println(newObj.getFullName());
        System.out.println(newObj.getFlNm());

    }
    
}
