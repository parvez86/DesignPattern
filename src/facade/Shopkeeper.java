package facade;

public class Shopkeeper {
    private MobileShop  iPhone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public Shopkeeper() {
        this.iPhone = new IPhone();
        this.samsung = new Samsung();
        this.blackberry = new Blackberry();
    }

    public void SaleIPhone(){
        iPhone.modelNo();
        iPhone.price();
    }

    public void SaleSamsung(){
        samsung.modelNo();
        samsung.price();
    }

    public void SaleBlackberry(){
        blackberry.modelNo();
        blackberry.price();
    }
}
