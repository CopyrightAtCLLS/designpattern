package bridge;

public class SlidePhone extends Phone{
    public SlidePhone(Brand brand) {
        super(brand);
    }

    public void bootup() {
        super.bootup();
        System.out.println("Slide Phone Type");
    }

    public void shutdown() {
        super.shutdown();
        System.out.println("Slide Phone Type");
    }

    public void call() {
        super.call();
        System.out.println("Slide Phone Type");
    }
}
