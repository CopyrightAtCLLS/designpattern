package state;

public class NoRaffleState implements State {
    Activity activity;

    public NoRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("===== 成功扣除积分 =====");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("===== 扣分后才能抽奖 =====");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("===== 不能发放奖品 =====");
    }
}
