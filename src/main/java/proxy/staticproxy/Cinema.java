package proxy.staticproxy;

public class Cinema implements Movie {
    @Override
    public void show() {
        System.out.println("Avatar is being playing");
    }
}
