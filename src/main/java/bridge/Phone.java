package bridge;

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void bootup() {
        this.brand.bootup();
    }

    protected void shutdown() {
        this.brand.shutdown();
    }

    protected void call() {
        this.brand.call();
    }
}
