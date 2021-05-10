package command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int which, Command onCommand, Command offCommand) {
        onCommands[which] = onCommand;
        offCommands[which] = offCommand;
    }

    public void on(int which) {
        onCommands[which].execute();
        undoCommand = onCommands[which];
    }

    public void off(int which) {
        offCommands[which].execute();
        undoCommand = offCommands[which];
    }

    public void undo() {
        undoCommand.undo();
    }
}
