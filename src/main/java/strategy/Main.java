package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        int a = 10, b = 5;
        System.out.println(a + " + " + b + " = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println(a + " - " + b + " = " + context.executeStrategy(10, 5));
        context = new Context(new OperationMultiply());
        System.out.println(a + " * " + b + " = " + context.executeStrategy(10, 5));
    }
}
