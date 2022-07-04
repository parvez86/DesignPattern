package Observer;

public class HexaDecimalObserver extends Observer{

    public HexaDecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hexa Decimal String: "+ Integer.toHexString(this.subject.getState()));
    }
}
