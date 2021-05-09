package template;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== 红豆豆浆 ====");
        new RedBeanSoyMilk().make();
        System.out.println("==== 花生豆浆 ====");
        new PeanutSoyMilk().make();
        System.out.println("==== 纯豆浆 ====");
        new PureSoyMilk().make();
    }
}
