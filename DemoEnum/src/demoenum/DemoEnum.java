/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the t,emplate in the editor.
 */
package demoenum;

/**
 *
 * @author helen
 */

public class DemoEnum {

    public enum Day{
        MO, TU, WE, TR, FR, SA, SU
    }    
    
    Day day;
    public DemoEnum(Day day){
        this.day = day;
    }
    
    public void spellTheDay(){
        switch(day){
            case MO:
            case TU:
                System.out.println("beginning of week");
                break;
            case WE:
            case TR:
                System.out.println("Middel of the week");
                break;
            default:
                System.out.println("the weekend!");
                break;
        }
    }
    
    public enum Planet{
        EARTH(123, 456),
        JUPITER(444,555);
        private final int test1;
        private final int test2;
        
        Planet(int tt1, int tt2){
            this.test1 = tt1;
            this.test2=tt2;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DemoEnum demoIt = new DemoEnum(Day.MO);
        demoIt.spellTheDay();
        
        DemoEnum demoItAgain = new DemoEnum(Day.SU);
        demoItAgain.spellTheDay();

    }
    
}
