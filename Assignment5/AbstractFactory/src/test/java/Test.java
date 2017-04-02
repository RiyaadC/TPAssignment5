import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/31/2017.
 */
public class Test extends TestCase
{

    Luxuries dp = new Luxuries();
    DairyProducts d = new DairyProducts();
    public void testcodeChoc() throws Exception
    {

        assertEquals(dp.getItemName("Choc").getItemName(),"Choc");
    }

    public void testcodeChips() throws Exception
    {

        assertEquals(dp.getItemName("Chi").getItemName(),"Chips");
    }

    public void testcodeMilk() throws Exception
    {

        assertEquals(d.getItemName("Mil").getItemName(),"Milk");
    }

    public void testcodeCheese() throws Exception
    {

        assertEquals(d.getItemName("Chee").getItemName(),"Cheese");
    }
}
