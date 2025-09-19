package ngay29;

public class Client {
    public static void main(String[] args) {
        Shape[] figures = new Shape[4];
        figures[0] = new Line();
        figures[1] = new Circular();
        figures[2] = new Circular();
        Composite comp = new Composite();
        comp.add(new Line());
        comp.add(new Line());
        comp.add(new Circular());
        figures[3] = comp;
        for (Shape shape : figures) {
            shape.setColor(0xFF0000);
            shape.rotate(20);
        }
    }
}
