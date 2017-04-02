/**
 * Created by Riyaad on 4/1/2017.
 */
public class PDFBook implements Book
{
    private LibraryBook LB;
    private String PDFName;

    public PDFBook(String PDFName)
    {
        this.PDFName = PDFName;
    }

    @Override
    public String display()
    {
        if(LB == null)
        {
            LB = new LibraryBook(PDFName);
        }
        return LB.display();
    }

}
