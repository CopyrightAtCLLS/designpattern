package command;

import command.receiver.TVReceiver;

public class TVOffCommand implements Command {
    private TVReceiver TVReceiver;

    public TVOffCommand(TVReceiver TVReceiver) {
        this.TVReceiver = TVReceiver;
    }

    @Override
    public void execute() {
        TVReceiver.off();
    }

    @Override
    public void undo() {
        TVReceiver.on();
    }
}
