/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoenumcard;

/**
 *
 * @author helen
 */
public class DemoCard {
    
    public enum Suit{
        CLUB, DIAMOND, HEART, SPADE 
    }
    public enum Rank {
        ACE, ONE, TWO, THREE, TEN, JACK, QUEEN, KING
    }
    private final Rank cardRank;
    private final Suit cardSuit;
    //static final String[] SUIT = {"CLUB", "DIAMOND","HEART","SPADE"};
   /* public boolean validateRank(int theR){
        
        return true;
    }
    public boolean validateSuit(int theS){
        
        return true; 
    }*/
    public DemoCard(Rank rank, Suit suit){
        //assert validateRank();
        //assert validateSuit();
        cardRank = rank;
        cardSuit = suit;
    }
   
    public Rank getCardID(){
        return cardRank;
    }
    public Suit getCardSuit(){
        return cardSuit;
    }
    
    public void displayCard(){
        System.out.println("The id is: " + cardRank + "  The suit is: " + cardSuit);
    }
    
    /*public static void main(String[] args){

        DemoDeckOfCard allCards = new DemoDeckOfCard();
        if (allCards!=null){
            allCards.displayDeckOfCard();
        } else {
            System.out.println("error on null pts");
        }
}*/
    }