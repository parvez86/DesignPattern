package lightWeightStrategy;

// strategy
public class PhoneCall implements Communicable{
    @Override
    public String communicate(String destination, String message) {
        return "Communicating via phone call: sending message to destination["+
                destination+"], message: ["+message+"]";
    }
}
