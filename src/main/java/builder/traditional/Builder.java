package builder.traditional;

public abstract class Builder {
    abstract void buildCPU(String cpu);

    abstract void buildMemory(String memory);

    abstract void buildOS();

    abstract Computer build();
}
