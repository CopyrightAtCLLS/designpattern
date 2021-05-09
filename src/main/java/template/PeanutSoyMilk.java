package template;

public class PeanutSoyMilk extends SoyMilk {
    @Override
    protected void addCondiment() {
        System.out.println(" => 加入花生");
    }
}
