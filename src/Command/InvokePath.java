package Command;

public class InvokePath {

    Command command = null;

    public InvokePath(Command command) {
        this.command = command;
    }

    public void path(){
        command.execute();
    }
}
