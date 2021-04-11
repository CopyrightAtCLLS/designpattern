package adapter.charging;

public class ChargeAdapter implements Adapter {
    private Socket socket;

    public ChargeAdapter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public String adapt() {
        String charge = socket.charge();
        return charge + " -> 110V";
    }
}
