package facade;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy Tab 3");
    }

    @Override
    public void price() {
        System.out.println("45,000.00");
    }
}
