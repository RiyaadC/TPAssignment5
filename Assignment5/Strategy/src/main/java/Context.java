/**
 * Created by Riyaad on 4/1/2017.
 */
public class Context
{
private Deck d;

    public Context(Deck d)
    {
        this.d = d;
    }

    public int execute()
    {
        return d.deckchanges();
    }

}
