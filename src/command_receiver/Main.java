package command_receiver;

public class Main {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Button b = new Button(new CancelCommand(receiver));
        Button b1 = new Button(new SaveCommand(receiver));

        ToolbarButtons tb = new ToolbarButtons(receiver);
        tb.addButton(b);
        tb.addButton(b1);
        tb.run();
    }
}
