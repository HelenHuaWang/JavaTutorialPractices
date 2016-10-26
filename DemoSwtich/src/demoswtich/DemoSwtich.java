/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswtich;

/**
 *
 * @author helen
 */
        
        
        
public class DemoSwtich {

    /**
     * @param args the command line arguments
     */
    
    public static int getMonthNumber(String month){
//        int monthNumber = 0; 
        
        if (month == null){
            return 0;
        }
        switch(month.toLowerCase()){
            case "j":
                return 1;
            case "f":
                return 2;
            default: return 3;
        }
        
 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String month = "J";
        int theMonth = getMonthNumber("J");
  if (theMonth != 0){
        System.out.println(theMonth);} else {
      System.out.println("OK");
  }
        /* java.util.ArrayList<String> futureMonths = 
                new java.util.ArrayList<String>();
                
        int month=1;
        switch(month){
        case 1: futureMonths.add("J"); break;
        case 2: futureMonths.add("F");
        break;
        default: break; 
    
    }
                System.out.println(futureMonths);

        */
    }
    
}
