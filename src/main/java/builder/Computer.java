package builder;

public abstract class Computer {
    private String cpu;
    private String memory;
    protected String OS;

    protected Computer() {
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}
