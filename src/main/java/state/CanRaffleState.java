package state;

public class CanRaffle implements State {
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
