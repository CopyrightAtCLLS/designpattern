package state;

public class FinishedState implements State {
    Activity activity;

    public FinishedState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {

    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {

    }
}
