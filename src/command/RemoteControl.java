package command;

import java.util.ArrayList;
import java.util.List;

// invoker
public class RemoteControl {
    private List<Command> commandList = new ArrayList<>();

    public void press(Command command){
        commandList.add(command);
        command.execute();
    }
}
