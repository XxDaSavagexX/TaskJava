public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();


        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(triangle);
        printer.printShapeName(rectangle);
        printer.printShapeName(pentagon);
    }
}