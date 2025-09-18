package ngay29;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Shape {
    List<Shape> child = new ArrayList<>();
    public void add(Shape shape){
        child.add(shape);
    }
    public void remove(Shape shape){
        child.remove(shape);
    }
    public Shape getChild(int id){
        return child.get(id);
    }
    @Override
    void draw() {
        System.out.println("Ve Composite");
        for (Shape shape : child) {
            shape.draw();
        }
    }

    @Override
    void rotate(int angle) {
        System.out.println("Xoay 1 goc:" + angle + " do");
        for (Shape shape : child) {
            shape.rotate(angle);
        }
    }

    @Override
    void moveLeft(int point) {
        System.out.println("Di chuyen sang " + point + " diem ben trai");
        for (Shape shape : child) {
            shape.moveLeft(point);
        }
    }

    @Override
    void setColor(int color) {
        System.out.println("Dat mau:" + color);
        for (Shape shape : child) {
            shape.setColor(color);
        }
    }
}
