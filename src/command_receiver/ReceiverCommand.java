package command_receiver;

public abstract class ReceiverCommand implements Command {

    protected Receiver receiver;

    public ReceiverCommand(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public abstract void execute();
}
