package proxy.staticproxy;


public class Cinema implements Movie {
    private Movie movie;

    public Cinema(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void show() {
        ads();
        movie.show();
        end();
    }

    public void ads() {
        System.out.println("Some annoying ads...");
    }

    public void end() {
        System.out.println("Cast credit...");
    }

    public static void main(String[] args) {
        new Cinema(new Avatar()).show();
    }
}
