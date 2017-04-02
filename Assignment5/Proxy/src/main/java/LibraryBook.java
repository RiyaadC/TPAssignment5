/**
 * Created by Riyaad on 4/1/2017.
 */
public class LibraryBook implements Book
{
private String BookName;

    public LibraryBook(String bookName)
    {
        BookName = bookName;
        retriveBook(bookName);
    }

    @Override
    public String display()
    {
        return "Displaying " + BookName;
    }

    private void retriveBook(String BName)
    {
        System.out.println("Loading " + BName);
    }
}
