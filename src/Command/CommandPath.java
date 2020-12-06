package Command;

public class CommandPath implements Command{
    private Receiver receiver = null;

    public CommandPath(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.path();
    }
}
