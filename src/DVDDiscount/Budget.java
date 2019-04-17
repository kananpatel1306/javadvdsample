package DVDDiscount;

public class Budget extends DVD
    {
        final double discount=0.5;
    public Budget()
    {
        super();
    }

    public Budget(double ePrice)
    {
        super(ePrice);
    }
    public double discount()
    {
        return discount*price;
    }
}
