/**
 * Created by Riyaad on 3/31/2017.
 */
public class Luxuries implements ItemsFactory
{




    @Override
    public Item getItemName(String ItmCode)
    {
        if(ItmCode=="Choc")
        {

            return new Chocolate();
        }

        else if(ItmCode=="Chi")
        {

            return new Chips();
        }
        else
        {
            System.out.println("Item code " + ItmCode + "does not exist");
        }

        return null;

    }
}
