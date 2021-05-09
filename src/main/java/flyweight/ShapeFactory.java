package flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapeMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("Create => " + circle + " with " + color);
        }
        return circle;
    }
}
