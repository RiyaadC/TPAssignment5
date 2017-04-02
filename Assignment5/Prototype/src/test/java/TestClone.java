import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/31/2017.
 */
public class TestClone extends TestCase
{


    public void testCarName() throws Exception
    {
        Car c = new Car("BMW");

        assertNotSame(c.toString(),c.copy());

    }

    public void testCarModelNumber() throws Exception
    {
        Model m = new Model("318i");
        assertNotSame(m.toString(),m.copy());
    }


}
