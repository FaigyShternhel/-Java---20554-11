
/**
 * this class runs main class of milchama game
 *
 * @author (Faigy Shternel)
 * @version (16.3.2022)
 */

import javax.swing.JOptionPane;

public class Tester {
    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "Welcome to Milchama game we divided the deck of cards");
        DeckOfCards myDeck = new DeckOfCards();
        myDeck.firstPleyer();
        myDeck.scondPleyer();

        while (myDeck.DeckOfCards1.isEmpty() == false && myDeck.DeckOfCards2.isEmpty() == false                            ) // the game runs while both players have card
        {
            int card1 = myDeck.DeckOfCards1.get(0).getFace();
            int card2 = myDeck.DeckOfCards2.get(0).getFace();
            JOptionPane.showMessageDialog(null, "the card of first player is " + card1 + "\n" + "the card of second player is " + card2);

            if (card1 > card2) {
                JOptionPane.showMessageDialog(null, myDeck.firstBig());
            }
            if (card1 < card2) {
                JOptionPane.showMessageDialog(null, myDeck.secondBig());
            }
            if (card1 == card2) {
                JOptionPane.showMessageDialog(null, "wowwwwww now lets see who will win the MILCHAMA");
                JOptionPane.showMessageDialog(null, myDeck.milchama(myDeck.DeckOfCards1, myDeck.DeckOfCards2));
            }
        }

        if (myDeck.DeckOfCards1.isEmpty() == true) //end of game if second plyer won the game
        {
            JOptionPane.showMessageDialog(null, "the second player wun the game!!!!!!!!");
            JOptionPane.showMessageDialog(null, "end of game!!");
            return;
        }
        if (myDeck.DeckOfCards2.isEmpty() == true) ////end of game if first plyer won the game
        {
            JOptionPane.showMessageDialog(null, "the first player wun the game!!!!!!!!");
            JOptionPane.showMessageDialog(null, "end of game!!");
            return; 
        }
        return;
    }

}