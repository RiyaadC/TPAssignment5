/**
 * Created by Riyaad on 4/1/2017.
 */
public class CarDetails implements CarPartVisitor
{
    @Override
public void visit(CVJoint CV)
{
    System.out.println("CV Joint");
}
@Override
public void visit(GearBox gb)
{
        System.out.println("Gearbox");
}

@Override
public void visit(Door D)
{
        System.out.println("Door");
}

@Override
public void visit(CarClass C)

{
        System.out.println("Car");
}
}
