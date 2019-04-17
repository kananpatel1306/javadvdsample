package DVDDiscount;

public class Regular extends DVD{
    final double discount = 0.15;
    public Regular(){
        super();
    }
    public Regular (double ePrice){
        super(ePrice);
    }
    public double discount()
    {
        return discount*price;
    }
}
