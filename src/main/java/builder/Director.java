package builder;

public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String cpu, String memory) {
        builder.buildCPU(cpu);
        builder.buildMemory(memory);
        builder.buildOS();
    }
}
