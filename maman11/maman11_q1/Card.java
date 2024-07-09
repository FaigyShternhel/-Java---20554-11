
/**
 * this class represents a card
 * @author (Faigy Shternel)
 * @version (16.3.2022)
 */
public class Card
{
    private int face=0;//the value of the card
    /*
     * bild a new card
     */
    public Card(int face)
    {
        this.face=face;
    }

    /*
     * method tostring
     */
    public String toString()
    {
        return "my face is" + face;     
    }
/*
get method
 */
    public int getFace()
    {
        return face;   
    }

    /*
    set method
     */
    public void setFace(int face)
    {
        if (face>0 && face<14)
            this.face=face;
        else
            System.out.println("the value is not proper");
    }

}
