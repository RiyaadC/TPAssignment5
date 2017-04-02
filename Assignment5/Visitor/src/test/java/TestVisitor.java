import junit.framework.TestCase;

/**
 * Created by Riyaad on 4/1/2017.
 */
public class TestVisitor extends TestCase
{

    CarPart cp = new Door();
    CarPart cp1 = new GearBox();
    CarPart cp2 = new CVJoint();
    CarPart cp3 = new CarClass();
    public void testCarVisitDoor() throws Exception
    {
        cp.acceapt((new CarDetails()));
    }

    public void testCarVisitGearBox() throws Exception
    {
        cp1.acceapt((new CarDetails()));
    }

    public void testCarVisitCVJoint() throws Exception
    {
        cp2.acceapt((new CarDetails()));
    }

    public void testCarVisitCar() throws Exception
    {
        cp3.acceapt((new CarDetails()));
    }



}
