package main.java.BuilderPattern;

public class Mobile {

    private String name ;
    private String color ;
    private int Ram;
    private int processor;

    private Mobile(MobileBuilder mobileBuilder) {
        this.name=mobileBuilder.name;
        this.color=mobileBuilder.color;
        this.Ram=mobileBuilder.ram;
        this.processor=mobileBuilder.processor;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return Ram;
    }

    public int getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", Ram=" + Ram +
                ", processor=" + processor +
                '}';
    }

    static class MobileBuilder{

        private String name ;
        private String color ;
        private int ram;
        private int processor;

        public MobileBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MobileBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public MobileBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public MobileBuilder setProcessor(int processor) {
            this.processor = processor;
            return this;
        }

        public Mobile build(){
            return new Mobile(this);
        }
    }
}
