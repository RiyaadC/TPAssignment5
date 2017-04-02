/**
 * Created by Riyaad on 3/31/2017.
 */
public class CurrencyObjectAdapter implements CurrencyAdapter
{
private Currency c = new Currency();

@Override
public Rand getRand()

{
    return c.getAmount();
}

@Override
public Rand getRandtoPound()
    {
      Rand r = c.getAmount();
      return convertRand(r,15);
    }

    @Override
    public Rand getRandtoEuro()
    {
        Rand r = c.getAmount();
        return convertRand(r,12);
    }

    private Rand convertRand (Rand R,int rate)

    {
    return new Rand(R.getAmount()*rate);
    }

}
