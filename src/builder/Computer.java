package builder;

import java.util.function.Consumer;

public class Computer {
    // required
    private String HDD;
    private String processor;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // optional
    public String getHDD() {
        return HDD;
    }
    public String getProcessor() {
        return processor;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.processor = builder.processor;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // for lambda
    public static Computer create(Consumer<ComputerBuilder> builderConsumer){
        ComputerBuilder builder = ComputerBuilder.createComputer();
        builderConsumer.accept(builder);
        Computer computer = builder.build();
        return computer;
    }
    public void displayComputer(){
        System.out.println("Computer: ----------");
        System.out.println("HDD: "+HDD);
        System.out.println("Processor: "+processor);
        System.out.println("IsGraphicsCardEnabled: "+isGraphicsCardEnabled);
        System.out.println("IsBluetoothEnabled: "+isBluetoothEnabled);
    }

    // builder class
    public static final class ComputerBuilder{
        private String HDD;
        private String processor;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        private ComputerBuilder(){}
        public static ComputerBuilder createComputer(){
            return new ComputerBuilder();
        }

        public ComputerBuilder withHDD(String HDD){
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder withProcessor(String processor){
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
