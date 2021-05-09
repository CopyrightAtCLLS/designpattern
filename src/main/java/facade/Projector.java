package facade;

public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }


    public void on() {
        System.out.println("Projector is on");
    }

    public void off() {
        System.out.println("Projector is off");
    }

    public void work() {
        System.out.println("Projector is working ...");
    }
}
