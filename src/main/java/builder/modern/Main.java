package builder.modern;

public class Main {
    public static void main(String[] args) {
        Computer macbook = new Computer.Builder("Apple Silicon", "Intel", "Darwin").setCamera("Embedded").build();
        System.out.println(macbook);
    }
}
