/**
 * <p>Title: The Card class</p>
 *
 * <p>Description: This class will represent a single playing card </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * @author not attributable
 * @version 1.0
 */
public class Card
{
    // instance variables
    private int value;
    private String suit;

    /**
     * Card constructor --
     * this constructor gets called when an object of the Card class
     * is instantiated -- based upon the number received it determines the
     * value and suit of the card
     * @param num a number that gets converted to a value between 1 and 13
     */
    public Card(int num)
    {
        int suitNumber;
        value = num % 13;
        if (value == 0)
            value = 13;
        suitNumber = num / 13;
        if (suitNumber == 0)
            suit = new String("clubs");
        else if (suitNumber == 1)
            suit = new String("diamonds");
        else if (suitNumber == 2)
            suit = new String("hearts");
        else if (suitNumber == 3)
            suit = new String("spades");
        else
            suit = new String("ERROR");
    }

    /**
     * getValue method -- returns what's stored in the instance variable value
     * @return the state of the instance variable value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * getSuit method -- returns what's stored in the instance variable suit
     * @return a reference to a String that contains the state of the instance variable suit
     */
    public String getSuit()
    {
        return suit;
    }

    /** equalValue method -- determines if the otherCard's value is the same
     * as this card's value
     * @param otherCard a reference to the Card to compare to this Card
     * @return true if the values are equal, false if the values are not equal
     */
    public boolean equalValue(Card otherCard)
    {
        if (this.value == otherCard.value)
            return true;
        else
            return false;
    }

    /**
     * equalSuit method -- determines if the otherCards's suit is the same as
     * this card's suit
     * @param otherCard a reference to the Card to compare to this Card
     * @return true if the suits are the same, false if they are not
     */
    public boolean equalSuit(Card otherCard)
    {
        if (this.suit.equals(otherCard.suit))
            return true;
        else
            return false;
    }

    /**
     * getPointValue method -- this method returns the point value for the
     * card -- 11 if Ace is high, 1 if Ace is low, 10 for a face card, the actual value for cards
     * 2 through 10
     * @param aceHigh true if the ace has a high value of 11, false if it has a low value of 1
     * @return the point value of the card
     */
    public int getPointValue(boolean aceHigh)
    {
        if ((value == 1) && (aceHigh == true))
            return 11;
        else if ((value == 1) && (aceHigh == false))
            return 1;
        else if ((value >= 11) && (value <= 13))
            return 10;
        else
            return value;
    }

    /**
     * toString method -- this method returns the state of the card object
     * @return a reference to a String object that contains the values stored
     * in the instance variables
     */
    public String toString()
    {
        if (value == 1)
            return (new String("Ace of " + suit));
        else if (value == 11)
            return (new String("Jack of " + suit));
        else if (value == 12)
            return (new String("Queen of " + suit));
        else if (value == 13)
            return (new String("King of " + suit));
        else
            return (new String(value + " of " + suit));
    }
}
