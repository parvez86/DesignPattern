package facade;

public class IPhone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("IPhone 6");
    }

    @Override
    public void price() {
        System.out.println("65,000.00");
    }
}
