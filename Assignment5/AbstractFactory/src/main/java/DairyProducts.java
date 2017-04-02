/**
 * Created by Riyaad on 3/31/2017.
 */

public class DairyProducts implements ItemsFactory
{
    @Override
    public Item getItemName(String ItmCode)
    {
        Item itm;
        if(ItmCode=="Chee")
        {
            return new Cheese();
        }

        else if(ItmCode=="Mil")
        {

            return new Milk();
        }
        else
        {
            System.out.println("Item code " + ItmCode + "does not exist");
        }
        return null;

    }
}
