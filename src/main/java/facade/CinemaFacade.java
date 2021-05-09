package facade;

public class CinemaFacade {
    private Light light;
    private PopcornMachine popcornMachine;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public CinemaFacade() {
        this.light = Light.getInstance();
        this.popcornMachine = PopcornMachine.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready() {
        popcornMachine.on();
        popcornMachine.work();
        screen.down();
        projector.on();
        ;
        stereo.on();
        dvdPlayer.on();
        light.dim();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcornMachine.off();
        light.brighten();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
