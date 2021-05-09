package facade;

public class Light {
    private static Light instance = new Light();

    public static Light getInstance() {
        return instance;
    }


    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }

    public void dim() {
        System.out.println("Light is dimming ...");
    }
    public void brighten() {
        System.out.println("Light is brightening ...");
    }
}
