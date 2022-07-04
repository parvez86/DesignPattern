package command;

// command
public class OnCommand implements Command{
    private Tv tv;

    public OnCommand(Tv tv){
        this.tv = tv;
    }

    public void setTv(Tv tv){
        this.tv = tv;
    }

    public Tv getTv(Tv tv){
        return this.tv;
    }

    @Override
    public void execute() {
        tv.switchOn();
    }
}
