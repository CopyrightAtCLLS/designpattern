package facade;

public class Stereo {
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }


    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void turnUp() {
        System.out.println("Volume up");
    }

    public void turnDown() {
        System.out.println("Volume down");
    }
}
