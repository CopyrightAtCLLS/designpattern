package command;

import command.receiver.TVReceiver;

public class TVOnCommand implements Command {
    private TVReceiver TVReceiver;

    public TVOnCommand(TVReceiver TVReceiver) {
        this.TVReceiver = TVReceiver;
    }

    @Override
    public void execute() {
        TVReceiver.on();
    }

    @Override
    public void undo() {
        TVReceiver.off();
    }
}
