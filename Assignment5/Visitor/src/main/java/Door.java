/**
 * Created by Riyaad on 4/1/2017.
 */
public class Door implements CarPart
{
    @Override
    public void acceapt(CarPartVisitor  carvisitor)
    {
        carvisitor.visit(this);
    }
}
