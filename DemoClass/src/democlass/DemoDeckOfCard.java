/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlass;

/**
 *
 * @author helen
 */
public class DemoDeckOfCard {
   // private static int deckCardID = 0;
    private DemoCard[][] deckOfCard; 
    //static final String[] JOKERS= {"JOKER1", "JOKER2"};

    public DemoDeckOfCard(){
        deckOfCard = new DemoCard[13][4];
        for (int i=1; i<=13; i++){
            for (int j=1; j<=4; j++){
              deckOfCard[i-1][j-1] = new DemoCard(i, DemoCard.SUIT[j-1]); 
              System.out.println("DemoCard is: " + i + "..." + DemoCard.SUIT[j-1]);
            }
        }
    }
    
    public void displayDeckOfCard(){
        for (int i=1; i<14; i++){
            for (int j=1; j<4; j++){
           deckOfCard[i-1][j-1].displayCard();
            }
        }
    }
}
