package builder;

public class DellBuilder extends Builder {
    Computer computer = new Dell();

    @Override
    void buildCPU(String cpu) {
        computer.setCpu("Intel");
    }

    @Override
    void buildMemory(String memory) {
        computer.setMemory("Intel");
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
