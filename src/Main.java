public class ShapeFactory {
    public Shape getShape (int shapecode) {
        switch (shapecode) {
            case 0:
                return new Square();
            default:
                return new Circle();
        }
    }

}