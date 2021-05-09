package template;

public class PureSoyMilk extends SoyMilk {
    @Override
    protected void addCondiment() {
    }

    @Override
    protected boolean isPure() {
        return true;
    }
}
