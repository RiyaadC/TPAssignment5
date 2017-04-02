/**
 * Created by Riyaad on 4/1/2017.
 */
public class Sales60Handler extends SalesHandler
{
    public String Saleamount(int salesmade)
    {
        if(salesmade<80 & salesmade >60)
        {
            return "40% commission";
        }

        else
        {
            return sale.Saleamount(salesmade);
        }
    }

}
