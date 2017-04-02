/**
 * Created by Riyaad on 3/31/2017.
 */
public class Window extends House
{
private int l;
private int w;

    public Window(int l, int w, Construct con)
    {
        super(con);
        this.l = l;
        this.w = w;
    }

    public void Deploy()
    {
        con.constructWindows(3,2);

    }

}
