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
public class DemoCard {
    private int cardID;
    private String cardSuit;
    static final String[] SUIT = {"CLUB", "DIAMOND","HEART","SPADE"};
    
    public DemoCard(int id, String suit){
        if ((id >=1) && (id<=13)){
            cardID = id;
        }
        
        boolean valid = false;
        for (int j=0; j<4; j++){
            if (suit == SUIT[j]){
                cardSuit = suit;
                valid = true;
            }
        }
 
        if (!valid){
            System.out.println("Invalid suit: " + suit);
        }
            
        
    }
   
    public int getCardID(){
        return cardID;
    }
    public String getCardSuit(){
        return cardSuit;
    }
    
    public void displayCard(){
        System.out.println("The id is: " + cardID + "The suit is: " + cardSuit);
    }
    
    public static void main(String[] args){

        DemoDeckOfCard allCards = new DemoDeckOfCard();
        if (allCards!=null){
            allCards.displayDeckOfCard();
        } else {
            System.out.println("error on null pts");
        }
}
    }