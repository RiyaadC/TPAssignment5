import junit.framework.TestCase;

/**
 * Created by Riyaad on 4/1/2017.
 */
public class TestChainOfResposiblity extends TestCase
{
    SalesHandler s = new Sales40less();
    SalesHandler s1 = new Sales40Handler();
    SalesHandler s2 = new Sales60Handler();
    SalesHandler s3 = new Sales80Handler();

    public void testSalseLessThan40() throws Exception
    {
        assertEquals(s.Saleamount(35),"10% commission");
    }

    public void testSalseMoreThan40LessThan60() throws Exception
    {
        assertEquals(s1.Saleamount(50),"30% commission");
    }
    public void testSalseMoreThan60LessThan80() throws Exception
    {
        assertEquals(s2.Saleamount(70),"40% commission");
    }
    public void testSalseMoreThan80() throws Exception
    {
        assertEquals(s3.Saleamount(85),"50% commission");
    }


}
