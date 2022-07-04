package command;

/*
    Terminology:
        Command: Knows receiver and can invoke a single method of a receiver.
        Receiver: Performs task.
        Invoker: Has commands and knows how to use the commands.
        Client: Has commands & invoker. Passes the commands to the invoker.

     Purpose: Hides the creation logic from the end user, encapsulates all the required object, end user only
            knows commands & how to use that.

     example: remote, button.

 */


// client
public class CommandPatternDemo {
    public static void main(String[] args) {
        Tv tv =  new Tv();

        RemoteControl remote1 = new RemoteControl();

        Command onCommand = new OnCommand(tv);
        Command offCommand = new OffCommand(tv);
        remote1.press(onCommand);
        remote1.press(offCommand);

        // using lambda : only works for functional interface (override interface method)
        // there is no need to implement OnCommand & OffCommand class
        RemoteControl remote2 = new RemoteControl();
        remote2.press(() -> tv.switchOn());
        remote2.press(tv::switchOff);   // another expression

    }
}
