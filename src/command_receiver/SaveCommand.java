package command_receiver;

public class SaveCommand extends ReceiverCommand {

    public SaveCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.doSave();
    }


}
