package bridge;

public class Apple implements Brand {
    @Override
    public void bootup() {
        System.out.println("iPhone booting up ...");
    }

    @Override
    public void shutdown() {
        System.out.println("iPhone shutting down ...");
    }

    @Override
    public void call() {
        System.out.println("iPhone calling ...");
    }
}
