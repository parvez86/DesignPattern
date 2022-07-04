package lightWeightStrategy;

// strategy
public class Email implements Communicable{

    @Override
    public String communicate(String destination, String message) {
        return "Communicating via email: sending message to destination["+
                destination+"], message: ["+message+"]";
    }
}
