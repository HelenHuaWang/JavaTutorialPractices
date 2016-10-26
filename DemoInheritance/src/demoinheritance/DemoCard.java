/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoinheritance;

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
    //override object methods - equal; hashCode; toString
    @Override
    public boolean equals(Object obj){
        if(obj instanceof DemoCard){
            if(this==obj)
                return true;
            return (this.cardRank==((DemoCard) obj).cardRank)&&
                    (this.cardSuit==((DemoCard)obj).cardSuit);
        }else{
            return false;
        }
    }
    @Override
    public int hashCode(){
        final int seed = 37;
        int hash=1; 
        hash+=cardRank.hashCode()*37;
        hash+=cardSuit.hashCode();
        return hash;
    }
    @Override
    public String toString(){
        return "The Rank is "+cardRank.toString()+"  The Suit is "+cardSuit.toString();
    }
    public void displayCard(){
        System.out.println("The id is: " + cardRank + "  The suit is: " + cardSuit);
    }
    //display using toString()
    public void displayCardToString(){
        System.out.println(this.toString());
    }
   
    public static void main(String[] args){

        //DemoDeckOfCard allCards = new DemoDeckOfCard();
        DemoCard[][] allCards = new DemoCard[Suit.values().length][Rank.values().length]; 
        for (Suit suit:Suit.values()){
            for (Rank rank:Rank.values()){
                allCards[suit.ordinal()][rank.ordinal()]
                        =new DemoCard(rank, suit);
                if (allCards==null){
                    System.out.println("it's null");
                }
                System.out.println(allCards[suit.ordinal()][rank.ordinal()].toString());
            }
        }
        /*if (allCards!=null){
            //allCards.displayDecfCard();
        } else 
            System.out.println("error on null pts");
        }*/
    }
}
 