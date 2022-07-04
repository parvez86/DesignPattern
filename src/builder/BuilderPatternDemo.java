package builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer computer = Computer.ComputerBuilder.createComputer()
                .withHDD("1 TB")
                .withProcessor("4 GB")
                .setGraphicsCardEnabled(true)
//                .setBluetoothEnabled(true)
                .build();

        computer.displayComputer();

        System.out.println("\n\n");

        // with lambda
        Computer computer1 = Computer.create(builder ->
                builder.withHDD("1 TB").
                        withProcessor("4 GB").
                        setGraphicsCardEnabled(true).
                        setBluetoothEnabled(true).
                        build()
        );
        computer1.displayComputer();
    }
}
