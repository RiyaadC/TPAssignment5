/**
 * Created by Riyaad on 3/31/2017.
 */
public class Chocolate implements Item
{
    private String name;

    public Chocolate()
    {

    }


    @Override
    public String getItemName()
    {
        name="Choc";
        return name;
    }

}
