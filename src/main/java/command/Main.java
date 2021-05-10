package command;

import command.receiver.LightReceiver;
import command.receiver.TVReceiver;

public class Main {
    public static void main(String[] args) {
        //Light
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //TV
        TVReceiver TVReceiver = new TVReceiver();
        TVOnCommand TVOnCommand = new TVOnCommand(TVReceiver);
        TVOffCommand TVOffCommand = new TVOffCommand(TVReceiver);
        RemoteController controller = new RemoteController();
        //Light
        controller.setCommand(0, lightOnCommand, lightOffCommand);
        controller.on(0);
        controller.undo();
        controller.off(0);
        //TV
        controller.setCommand(1, TVOnCommand, TVOffCommand);
        controller.on(1);
        controller.undo();
        controller.off(1);
    }
}
