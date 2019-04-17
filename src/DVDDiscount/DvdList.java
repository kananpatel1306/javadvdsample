package DVDDiscount;

public class DvdList{
    private DVD[] dvdList;
    {
        dvdList = new DVD [5];

        dvdList[0] = new Regular (10);
        dvdList[1]= new Budget (5.3);
        dvdList[2] = new Budget(8);

        dvdList[3] = new Budget(6.5);
        dvdList[4] = new Budget(4.25);
    }
    public void displayResult()
    {
        for(int i=0;i<dvdList.length;i++)
        {
           dvdList[i].calculate();
        }
    }
}
