/**
 * Created by Riyaad on 4/1/2017.
 */
public class RemoveFromDeck implements Deck
{
    public int deckchanges()
    {
        int r =38;
        System.out.println("Currently " + r + "cards");
        r--;
        System.out.println("Currently " + r + "cards");
        return r;
    }
}
