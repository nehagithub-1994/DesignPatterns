package factory;

public class Operate {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape r = shapeFactory.getShape("C");
        r.draw();
    }
}
