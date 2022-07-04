package facade;

public class Blackberry implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("Blackberry Z10");
    }

    @Override
    public void price() {
        System.out.println("55,000.00");
    }
}
