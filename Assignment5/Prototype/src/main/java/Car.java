/**
 * Created by Riyaad on 3/31/2017.
 */
public class Car implements Clone
{
    private String name;

    public Car(String name)

    {
        this.name = name;
    }

    @Override
    public Clone copy()

    {
        return new Car(name);
    }

    @Override
    public String toString()

    {
        return name;
    }
}
