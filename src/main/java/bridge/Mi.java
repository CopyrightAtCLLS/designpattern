package bridge;

public class Mi implements Brand {
    @Override
    public void bootup() {
        System.out.println("Mi booting up ...");
    }

    @Override
    public void shutdown() {
        System.out.println("Mi shutting down ...");
    }

    @Override
    public void call() {
        System.out.println("Mi calling ...");
    }
}
