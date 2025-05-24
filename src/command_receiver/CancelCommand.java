package command_receiver;

public class CancelCommand extends ReceiverCommand {
    public CancelCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.doCancel();
    }
}
