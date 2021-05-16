package state;

public class Activity {
    private State state = null;
    private int count = 0;
    private State noRaffleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispensePrizeState(this);
    private State prizeOutState = new PrizeOutState(this);

    public Activity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void deductMoney() {
        state.deductMoney();
    }

    public void raffle() {
        if (state.raffle())
            state.dispensePrize();
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public int getCount() {
        int cur = count;
        count--;
        return cur;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getPrizeOutState() {
        return prizeOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
