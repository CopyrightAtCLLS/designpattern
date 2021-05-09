package bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void bootup() {
        super.bootup();
        System.out.println("Folded Phone Type");
    }

    public void shutdown() {
        super.shutdown();
        System.out.println("Folded Phone Type");
    }

    public void call() {
        super.call();
        System.out.println("Folded Phone Type");
    }
}
