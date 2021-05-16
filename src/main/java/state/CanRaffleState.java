package state;

import java.util.Random;

public class CanRaffleState implements State {
    Activity activity;

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("===== 已经扣取过积分 =====");
    }

    @Override
    public boolean raffle() {
        System.out.println("===== 正在抽奖 =====");
        Random r = new Random();
        int num = r.nextInt(10);
        if (num == 0) {
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("===== 很遗憾,没有抽中 =====");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("===== 没中奖,不能领取奖品 =====");
    }
}
