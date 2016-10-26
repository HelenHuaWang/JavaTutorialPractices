/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoanonymous;

/**
 *
 * @author helen
 */
public class DemoAnonymous {

    /**
     * @param args the command line arguments
     */
    public interface SayHello{
        public void sayHi();
        public void sayHiTo(String someone);
    }
    
    public void say(){
        
        class EnglishSay implements SayHello{
        
            @Override
            public void sayHi(){
                System.out.println("To say Hi!");
            }
            @Override
            public void sayHiTo(String someone){
                System.out.println("To say Hi to " + someone);
            }
        }
        
        EnglishSay english = new EnglishSay();
        english.sayHi();
        english.sayHiTo("TOM");
        
        SayHello french = new SayHello(){
            @Override
            public void sayHi(){
               System.out.println("To say Hi! IN french ");
            }
            @Override
            public void sayHiTo(String someone){
               System.out.println("To say Hi! IN french to " + someone);
            }
        };
        
        french.sayHi();
        french.sayHiTo("Frank");
                
        SayHello spanish = new SayHello(){
            @Override
            public void sayHi(){
                
            }
            @Override
            public void sayHiTo(String someone){
                
            }
        };
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        DemoAnonymous test = new DemoAnonymous();
        test.say();
    }
    
}
