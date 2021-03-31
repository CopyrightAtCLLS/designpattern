package builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("Apple Silicon", "Intel");

        Computer computer = builder.build();
        System.out.println(computer);
        System.out.println("----------------------------------------------------------");

        builder = new DellBuilder();
        director = new Director(builder);
        director.construct("Intel", "Intel");
        computer = builder.build();
        System.out.println(computer);
    }
}
