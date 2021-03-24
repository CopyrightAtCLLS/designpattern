package singleton.starving;

public class Singleton {
    private static Singleton instance=new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
