package state;

public class PrizeOutState implements State {
    Activity activity;

    public PrizeOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("===== 奖品送完了 =====");
    }

    @Override
    public boolean raffle() {
        System.out.println("===== 奖品送完了 =====");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("===== 奖品送完了 =====");
    }
}
