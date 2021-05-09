package facade;

public class Main {
    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();
        cinemaFacade.ready();
        cinemaFacade.play();
        cinemaFacade.pause();
        cinemaFacade.end();
    }
}
