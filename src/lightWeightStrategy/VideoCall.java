package lightWeightStrategy;


// strategy
public class VideoCall implements Communicable{
    @Override
    public String communicate(String destination, String message) {
        return "Communicating via video call: sending message to destination["+
                destination+"], message: ["+message+"]";
    }
}
