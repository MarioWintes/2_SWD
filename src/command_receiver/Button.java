package command_receiver;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void onclick() {
        command.execute();
    }
}
