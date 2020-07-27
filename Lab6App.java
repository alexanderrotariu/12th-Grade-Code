//Lab 6 Application
//This file is for testing the PokerHand class and the Card class
//Authors: Alexander Rotariu
public class Lab6App
{
    public static void main(String [] args)
    {
        //Creating 4 new card objects using a param. constructer
        Card c1 = new Card(5);
        Card c2 = new Card(5);
        Card c3 = new Card(5);
        Card c4 = new Card(5);
        
        //Creating a new PokerHand object using a param. constructer
        PokerHand p1 = new PokerHand(c1, c2, c3, c4);
        
        //By printing PokerHand PokerHand's toString method is being called automatically
        System.out.println(p1+"\n");
        
//-------------------------------------------------------------------------      
        //Calling four of a kind method
        boolean fourOAK=p1.fourOfAKind();
        //if they are four of a kind
        if(fourOAK==true)
            System.out.println("Four of a Kind");
        //If they arent four of a kind
        else
            System.out.println("Not Four of a Kind");
        
        System.out.println("");
 //-------------------------------------------------------------------------             
        //Checking to see if flush method works
        boolean flush1=p1.flush();
        
        //If there is a flush
        if(flush1==true)
        {
            System.out.println("Flush");
        }
        //If there is no flush
        else 
        {
            System.out.println("Not a Flush");
        }
        
        System.out.println("");
        
//-------------------------------------------------------------------------        
        //Calling two pairs method
        boolean twoP1=p1.twoPair();
        
        //If there are two paris print two pairs
        if(twoP1==true)
        {
            System.out.println("2 Pairs");
        }
        //If there arent 2 pairs
        else
        {
            System.out.println("Not 2 Pairs");
        }
        
        System.out.println("");
//-------------------------------------------------------------------------      
            
        //Calling threeOfAKind
        boolean threeP1=p1.threeOfAKind();
        
        //If there are 3 cards
        if(threeP1==true)
        {
            System.out.println("Three of a Kind");
        }
        //If there are no 3 of a kind
        else
        {
            System.out.println("Not Three of a Kind");
        }
        
        System.out.println("");
//-------------------------------------------------------------------------    
        
        //Pair code
        
     
    }
}