package state;

public class DispensePrizeState implements State {
    Activity activity;

    public DispensePrizeState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("===== 不能扣取积分 =====");
    }

    @Override
    public boolean raffle() {
        System.out.println("===== 不能抽奖 =====");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("===== 恭喜中奖 =====");
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("===== 抱歉，奖品已经送完了=====");
            activity.setState(activity.getPrizeOutState());
        }
    }
}
