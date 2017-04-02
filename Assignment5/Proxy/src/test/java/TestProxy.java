import junit.framework.TestCase;
import org.junit.*;
import org.junit.Test;

/**
 * Created by Riyaad on 4/1/2017.
 */
public class TestProxy
{
    Book b = new PDFBook("Harry Potter");
    Book b1 = new LibraryBook("Lord Of the Rings");
    @Test
    public void TestPDFname() throws Exception
    {
       b.display();//loads the pdf book
        Assert.assertEquals(b.display(),"Displaying Harry Potter");
    }

    @Test
    public void testLibararyname() throws Exception
    {
        b1.display();
        Assert.assertEquals(b1.display(),"Displaying Lord Of the Rings");
    }
}
