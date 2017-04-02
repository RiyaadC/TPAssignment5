import junit.framework.TestCase;

/**
 * Created by Riyaad on 4/1/2017.
 */
public class TestStrategy extends TestCase
{
Context con = new Context(new AddToDeck());
    Context con1 = new Context(new RemoveFromDeck());
    public void testAddtodeck() throws Exception
    {
        assertEquals(con.execute(),39);
    }

    public void testRemoveFromdeck() throws Exception
    {
        assertEquals(con1.execute(),39);
    }

}
