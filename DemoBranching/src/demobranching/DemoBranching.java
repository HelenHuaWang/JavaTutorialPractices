/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobranching;

/**
 *
 * @author helen
 */
public class DemoBranching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myStr = "to look formmymymymmm string in this string";
        String subStr = "my";
        boolean foundIt = false; 
        int strLength = myStr.length();
        int subLength = subStr.length();
        int i=0; 
        int j=0;
        int loop =0; 
        //myLabel:
        for ( i=0; i<strLength; i++){
            loop = i; 
            for (j=0; j<subLength; j++){
                if (myStr.charAt(loop)!= subStr.charAt(j)){
                    break;
                } else {
                    loop++;
                }
            }
            if (j==subLength){
                System.out.println("find it: " + subStr);
            }
        }
            //if (myStr.charAt(i)==searchFor){
               // foundIt = true;
                //                continue;

                              //foundIt = true;
            
          //  }
                
        }
}