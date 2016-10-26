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
public class DemoEnumCard {
    /**
     * @param args the command line arguments
     */
    
   /* public void printCardSuit(){
        for (Suit s:Suit.values()){
            System.out.println("Suit values are: " + s);
        }
    }
    
    public void printCardRank(){
        for (Rank r:Rank.values()){
            System.out.println("The Rank is : " + r);
        }
    }
    */
    DemoCard[][] deck;

    public DemoEnumCard(){
        deck = new DemoCard[DemoCard.Rank.values().length][DemoCard.Suit.values().length];
        for (DemoCard.Rank r:DemoCard.Rank.values()){
            for (DemoCard.Suit s:DemoCard.Suit.values()){
                deck[r.ordinal()][s.ordinal()]=new DemoCard(r, s);
            }
        }
    }
    
    public void displayDeck(){
        for (DemoCard.Rank r:DemoCard.Rank.values()){
            for (DemoCard.Suit s:DemoCard.Suit.values()){
                deck[r.ordinal()][s.ordinal()].displayCard();
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //create a deck of card by new a set of two d array with enum
        //then printout all cards
        DemoEnumCard test = new DemoEnumCard();
        test.displayDeck();
    }
}
