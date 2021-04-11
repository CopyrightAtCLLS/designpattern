package adapter.charging;

public class Main {
    public static void main(String[] args) {
        System.out.println(new ChargeAdapter(new Socket()).adapt());
    }
}
