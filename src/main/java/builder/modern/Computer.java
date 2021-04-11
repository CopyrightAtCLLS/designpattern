package builder.modern;

public class Computer {
    private String cpu;
    private String memory;
    private String OS;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.OS = builder.OS;
    }

    public static class Builder {
        private String cpu;
        private String memory;
        private String OS;
        private String camera;

        public Builder(String cpu, String memory, String OS) {
            this.cpu = cpu;
            this.memory = memory;
            this.OS = OS;
        }

        public Builder setCamera(String camera) {
            this.camera = camera;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
