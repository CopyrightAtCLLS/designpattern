package builder;

public abstract class Builder {
    abstract void buildCPU(String cpu);
    abstract void buildMemory(String memory);
    abstract void buildOS(String OS);
    abstract Computer build();
}
