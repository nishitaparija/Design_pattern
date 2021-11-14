public interface Shape_b {
    void draw();
}
public class Rectangle implements Shape_b {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public String getType() {
        return null;
    }
}
public class Circle implements Shape_b {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public String getType() {
        return null;
    }
}
abstract class ShapeDecorator implements Shape_b {
    protected Shape_b decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = (Shape_b) decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
class RedShapeDecorator extends ShapeDecorator implements RedShapeDecorator_ {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder((Shape) decoratedShape);
    }

    @Override
    public String getType() {
        return null;
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape_b circle = new Circle();

        Shape_b redCircle = new RedShapeDecorator((Shape) new Circle());

        Shape_b redRectangle = new RedShapeDecorator((Shape) new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}