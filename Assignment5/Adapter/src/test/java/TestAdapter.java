import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/31/2017.
 */
public class TestAdapter extends TestCase
{
    CurrencyClassAdapter c = new CurrencyClassAdapter();
     Rand r = new Rand(10);
    public void testRandToEuro() throws Exception
    {
        assertEquals(c.getRandtoEuro().getAmount(),10);
    }

    public void testRandToPound() throws Exception
    {
        assertEquals(c.getRandtoPound().getAmount(),15);
    }

    public void testRand() throws Exception
    {

        assertEquals(c.getRand().getAmount(),5);
    }
}
