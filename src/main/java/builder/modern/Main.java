package builder.modern;

public class Main {
    public static void main(String[] args) {
        Computer.Builder macbook = new Computer.Builder("Apple Silicon", "Intel", "Darwin").setCamera("Embedded");
        System.out.println(macbook);
    }
}
