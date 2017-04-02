/**
 * Created by Riyaad on 3/31/2017.
 */
public class CurrencyClassAdapter extends Currency implements CurrencyAdapter
{

    @Override
    public Rand getRand()

    {
        return getAmount();
    }

    @Override
    public Rand getRandtoPound()
    {
        Rand r = getAmount();
        return convertRand(r,3);
    }

    @Override
    public Rand getRandtoEuro()
    {
        Rand r = getAmount();
        return convertRand(r,2);
    }

    private Rand convertRand (Rand R,int rate)

    {
        return new Rand(R.getAmount()*rate);
    }

}
