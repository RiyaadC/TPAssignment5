/**
 * Created by Riyaad on 4/1/2017.
 */
public abstract class SalesHandler
{
    SalesHandler sale;

    public void setSale(SalesHandler sale)
    {
        this.sale = sale;
    }

    public abstract String Saleamount(int salesmade);
}
