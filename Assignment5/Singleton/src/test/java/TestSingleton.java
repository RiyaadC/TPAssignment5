import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Riyaad on 3/30/2017.
 */
public class TestSingleton extends TestCase
{
    MakeSingleton make = MakeSingleton.getInstance();
    @Test

    public void testSingletonName()
    {
    assertEquals(make.getName("Riyaad"),"Riyaad");

    }

    public void testSingletonAge()
    {
        assertEquals(make.getAge(10),10);

    }

}
