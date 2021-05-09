package facade;

public class PopcornMachine {
    private static PopcornMachine instance = new PopcornMachine();

    public static PopcornMachine getInstance() {
        return instance;
    }


    public void on() {
        System.out.println("Popcorn machine is on");
    }

    public void off() {
        System.out.println("Popcorn machine is off");
    }

    public void work() {
        System.out.println("Popcorn machine is working ...");
    }
}
