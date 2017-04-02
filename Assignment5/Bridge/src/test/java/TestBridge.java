import junit.framework.TestCase;

/**
 * Created by Riyaad on 3/31/2017.
 */
public class TestBridge extends TestCase
{
        Window h1 = new Window(50,20,new KitchenWindow());
    Window h2 = new Window(50,20,new RoomWindow());
    public void testKitchenWindow() throws Exception
    {
       h1.Deploy();
    }

    public void testRoomWindow() throws Exception
    {
        h2.Deploy();
    }
}
