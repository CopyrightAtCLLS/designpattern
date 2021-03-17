package proxy.staticproxy;

/**
 * 静态代理
 * 1、一个接口
 * 2、一个接口实现类
 * 3、代理类对接口实现类加强
 * 缺点:
 * 1、很不灵活
 */
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
