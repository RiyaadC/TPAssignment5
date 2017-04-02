/**
 * Created by Riyaad on 3/30/2017.
 */
public class MakeSingleton
{
    private static MakeSingleton MS=null;

    private MakeSingleton()
    {

    }

    public static MakeSingleton getInstance()
    {
        if(MS==null)
        {
            MS = new MakeSingleton();
        }

        return MS;
    }

    public String getName(String name)
    {
        return name;
    }

    public int getAge(int age)
    {
        return age;
    }

}
