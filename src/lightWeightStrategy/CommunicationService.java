package lightWeightStrategy;

// service provider
public class CommunicationService {
    private Communicable communicable;

    public void setCommunicable(Communicable communicable){
        this.communicable = communicable;
    }
    public void sendMessage(String destination, String message){
        System.out.println(communicable.communicate(destination, message));
    }
}
