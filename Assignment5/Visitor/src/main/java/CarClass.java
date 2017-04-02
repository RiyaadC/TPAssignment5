/**
 * Created by Riyaad on 4/1/2017.
 */
public class CarClass implements CarPart
{
CarPart[] parts;

    public CarClass()

    {
        parts=new CarPart[]{new GearBox(),new CVJoint(),new Door()};
    }

    @Override
    public void acceapt(CarPartVisitor  carvisitor)
    {
        for(int i=0;i<parts.length;i++)
        {
            parts[i].acceapt(carvisitor);
        }
        carvisitor.visit(this);
    }
}
