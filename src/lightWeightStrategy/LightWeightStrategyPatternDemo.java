package lightWeightStrategy;


// purpose: end user can determine which strategy should work at runtime among all
// use cases: sorting algorithm, Collection.sort, comparator, encryption
public class LightWeightStrategyPatternDemo {
    public static void main(String[] args) {
        Communicable emailCommunicable = new Email();
        Communicable phoneCallCommunicable = new PhoneCall();
        Communicable videoCallCommunicable = new VideoCall();

        CommunicationService service = new CommunicationService();
        service.setCommunicable(emailCommunicable);
        service.sendMessage("sp86@gmail.com", "Hi, how are you?");

        service.setCommunicable(phoneCallCommunicable);
        service.sendMessage("017xxxxxxxx", "Hi, how are you?");

        service.setCommunicable(videoCallCommunicable);
        service.sendMessage("SP", "Hi, how are you?");

        // with lambda
        service.setCommunicable((destination, message) -> { return "Communicating via email: sending message to destination["+
                destination+"], message: ["+message+"]";});
        service.sendMessage("sp86@gmail.com", "Hi, how are you?");

        service.setCommunicable((destination, message) -> { return "Communicating via phone call: sending message to destination["+
                destination+"], message: ["+message+"]";});
        service.sendMessage("017xxxxxxxx", "Hi, how are you?");

        service.setCommunicable((destination, message) -> { return "Communicating via video call: sending message to destination["+
                destination+"], message: ["+message+"]";});
        service.sendMessage("SP", "Hi, how are you?");


    }
}
