package decorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setGreenBorder(decoratedShape);
    }
    private void setGreenBorder(Shape decoratedShape){
//        decoratedShape.draw();
        System.out.println("Border color: Green");
    }
}
