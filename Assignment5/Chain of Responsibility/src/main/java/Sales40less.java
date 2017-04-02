/**
 * Created by Riyaad on 4/1/2017.
 */
public class Sales40less extends SalesHandler
{
    public String Saleamount(int salesmade)
    {
        if(salesmade<40)
        {
            return "10% commission";
        }

        else
        {
            return sale.Saleamount(salesmade);
        }
    }

}
