package template;

public abstract class SoyMilk {
    public final void make() {
        chooseMaterial();
        addCondiment();
        soak();
        beat();
    }

    private void chooseMaterial() {
        System.out.println(" => 加入黄豆");
    }

    abstract protected void addCondiment();

    private void soak() {
        System.out.println(" => 浸泡");
    }

    private void beat() {
        System.out.println(" => 打浆");
    }
}
