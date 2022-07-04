package factory;

// purpose: hiding creation logic from the end/client
// use-cases: jdk, database connection, adding new product, network resources
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Triangle").draw();
        shapeFactory.getShape("Rectangle").draw();
    }
}
