package template;

public class RedBeanSoyMilk extends SoyMilk {
    @Override
    protected void addCondiment() {
        System.out.println(" => 加入红豆");
    }
}
