/**
 * Created by Riyaad on 3/31/2017.
 */
public class Model implements Clone
{
    public String modelNumber;

    public Model(String modelNumber)

    {
        this.modelNumber = modelNumber;
    }

    @Override
    public Clone copy()
    {
        return new Model(modelNumber);
    }

    @Override
    public String toString()

    {
        return modelNumber;
    }
}
