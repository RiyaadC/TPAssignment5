/**
 * Created by Riyaad on 4/1/2017.
 */
public class Sales80Handler extends SalesHandler
{
@Override
public String Saleamount(int salesmade)
{
    if(salesmade>80)
    {
        return "50% commission";
    }

    else
    {
        return sale.Saleamount(salesmade);
    }
}

}
