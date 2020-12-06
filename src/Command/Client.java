package Command;

public class Client {

    public static void main(String[] args) {
        InvokerList invokerList = new InvokerList(new CommandList(new Receiver()));
        //invokerList.list();

        InvokePath invokePath = new InvokePath( new CommandPath(new Receiver()));
        invokePath.path();
    }
}
