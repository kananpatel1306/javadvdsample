package DVDDiscount;

public abstract class DVD
{
    protected double price;
    public DVD()
    {
        price = 0.0;
    }
    public DVD (double ePrice)
    {

        price=ePrice;
    }
    public abstract double discount();

    public void calculate()
    {
        System.out.println("Original Price:$"+price);
        System.out.println("Discounted Price:$"+(price-discount()));
    }
}
