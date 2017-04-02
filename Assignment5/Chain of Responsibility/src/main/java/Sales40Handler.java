/**
 * Created by Riyaad on 4/1/2017.
 */
public class Sales40Handler extends SalesHandler
{
    public String Saleamount(int salesmade)
    {
        if(salesmade<60&&salesmade>40)
        {
            return "30% commission";
        }

        else
        {
            return sale.Saleamount(salesmade);
        }
    }
}
