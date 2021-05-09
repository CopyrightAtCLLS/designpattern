package flyweight;

public class Main {
    private static final String COLORS[] = {"RED", "GREEN", "BLUE", "WHITE", "BLACK"};

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 100));
            circle.setRadius(100);
            circle.draw();
        }
    }
}
