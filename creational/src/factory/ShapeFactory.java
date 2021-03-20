package factory;

public class ShapeFactory {

    Shape getShape(String p) {

        if (p.equals("R")) {
            return new Rectangle();
        } else if (p .equals("C")) {
            return new Circle();
        }
        return null;
    }
}
