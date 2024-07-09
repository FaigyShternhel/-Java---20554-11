
/**
 * this class bilds a deck of cards and has methods for the milchama game.
 *
 * @author (Faigy Shternel)
 * @version (16.3.2022)
 */

import java.math.*;// import the Random class
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DeckOfCards {
    protected Card[] deck; //array of akk cards
    protected ArrayList<Card> DeckOfCards1 = new ArrayList<Card>(); // Create an ArrayList of cards for the first player
    protected ArrayList<Card> DeckOfCards2 = new ArrayList<Card>(); // Create an ArrayList of cards for the second player
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static int randomNumbers = (int) (Math.random());//create a random int
    private ArrayList<Card> temp = new ArrayList<Card>(); // Create a temp ArrayList of cards that a player will win
    private Card temp1; //the current card of first player
    private Card temp2; //the current card of second player

/*
this constructor bilds a deck of cards
 */
    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card((count % 13) + 1);
    }

/*
this method devids the deck of card for first player and puts them in an arraylist
 */
    public void firstPleyer() {
        int random;
        for (int i = 51; i > 25; i--) {
            random = (int) (Math.random() * i);
            DeckOfCards1.add(deck[random]);
            deck[random] = deck[i];
        }
    }
/*
this method devids the deck of card for second player and puts them in an arraylist
 */
    public void scondPleyer() {
        for (int i = 0; i < 26; i++) {
            DeckOfCards2.add(deck[i]);
        }
    }
/*
this method provides the milchama situation
 */
    public String milchama(ArrayList deck1, ArrayList deck2) {
        while (DeckOfCards1.isEmpty() == false && DeckOfCards2.isEmpty() == false) {
            for (int i = 0; i < 2; i++) //the michama is on 3 cards
            {
                if (isLast(DeckOfCards1)) { //check that this is not the last card
                    temp.add(DeckOfCards1.get(0));
                    DeckOfCards1.remove(0);
                }
                if (isLast(DeckOfCards2)) { //check that this is not the last card
                    temp.add(DeckOfCards2.get(0));
                    DeckOfCards2.remove(0);
                }
            }
            temp1 = DeckOfCards1.get(0);
            temp2 = DeckOfCards2.get(0);
            if (temp1.getFace() > temp2.getFace()) { //if first player is bigger then go to firstBigMilchama method
                return firstBigMilchama();

            }
            if (temp1.getFace() < temp2.getFace()) { //if second player is bigger then go to secondBigMilchama method
                return  secondBigMilchama();
            }
            if (temp1.getFace() == temp2.getFace()) { //if the cards are equale then go again to milchama  method
                JOptionPane.showMessageDialog(null, "AGAIN MILCHAMA");
                return milchama(DeckOfCards1, DeckOfCards2);
            }
         }
        return "";
    }
/*
this method checks if the current card is the last one for a player
 */
    public boolean isLast(ArrayList check) {
        if (check.size() > 1)
            return true;
        else
            return false;
    }
/*
this method provides the situation of the first player wining
 */
    protected String firstBig() {
        temp.add(DeckOfCards1.get(0));
        temp.add(DeckOfCards2.get(0));
        DeckOfCards1.remove(0);
        DeckOfCards2.remove(0);
        DeckOfCards1.addAll(temp);
        temp.clear();
        String firstWin = "first player wun";
        return firstWin;
    }
    /*
    this method provides the situation of the first player wining the milchama
     */
    public String firstBigMilchama() {
        String milchamaWin = firstBig() + " the milchama";
        return milchamaWin;
    }
    /*
    this method provides the situation of the second player wining
     */
    protected String secondBig() {
        temp.add(DeckOfCards2.get(0));
        temp.add(DeckOfCards1.get(0));
        DeckOfCards1.remove(0);
        DeckOfCards2.remove(0);
        DeckOfCards2.addAll(temp);
        temp.clear();
        String secondWin = "second player player wun";
        return secondWin;

    }
    /*
       this method provides the situation of the second player wining the milchama
        */
    public String secondBigMilchama() {
        String milchamaWin = secondBig() + "  the milchama";
        return milchamaWin;
    }
}