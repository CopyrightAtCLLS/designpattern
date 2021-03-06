package builder.traditional;

public class DellBuilder extends Builder {
    Computer computer = new Dell();

    @Override
    void buildCPU(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    void buildOS() {
        computer.setOS();
    }

    @Override
    Computer build() {
        return computer;
    }
}
