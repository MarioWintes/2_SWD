package command_receiver;

import java.util.ArrayList;
import java.util.List;

public class ToolbarButtons {

    private Receiver receiver;
    private List<Button> buttons = new ArrayList<>();

    public ToolbarButtons(Receiver receiver) {
        this.receiver = receiver;
    }

    public void run(){
        for (Button button : buttons) {
            button.onclick();
        }
    }

    public void addButton(Button button){
        buttons.add(button);
    }
}
