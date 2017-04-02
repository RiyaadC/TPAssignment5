/**
 * Created by Riyaad on 4/1/2017.
 */
public interface CarPartVisitor
{
    public void visit(CVJoint cv);
    public void visit(Door door1);
    public void visit(GearBox gb);
    public void visit(CarClass car);
}
