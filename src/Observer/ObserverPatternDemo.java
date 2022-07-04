package Observer;

// purpose: implement one-to-many relationship with loose coupling where dependents are automatically notified in-case of any changed occurs on subject
// use cases: weather update, notification, stock prices, action listener for button
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaDecimalObserver(subject);

        subject.setState(15);
    }
}
