package builder;

public class MacbookBuilder extends Builder {
    Computer computer = new MacBook();

    public MacbookBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    void buildCPU(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    void buildOS(String OS) {
        computer.setOS(OS);
    }

    @Override
    Computer build() {
        return computer;
    }
}
