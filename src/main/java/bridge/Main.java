package bridge;

public class Main {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Apple());
        phone.bootup();
        phone.call();
        phone.shutdown();
        System.out.println("-------------------------------");
        phone = new SlidePhone(new Mi());
        phone.bootup();
        phone.call();
        phone.shutdown();
    }
}
