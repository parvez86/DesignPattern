package decorator;


// purpose: adding new features dynamically without changing the behavior of existing code
// application:
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
//        Triangle triangle = new Triangle();
        Rectangle rectangle =  new Rectangle();
        Shape redCircle = new RedShapeDecorator(circle::draw);
        redCircle.draw();

        Shape greenRectangle = new GreenShapeDecorator(rectangle::draw);
        greenRectangle.draw();
    }
}
