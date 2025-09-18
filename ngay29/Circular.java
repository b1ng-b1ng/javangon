package ngay29;

public class Circular extends Shape{
    int centerX, centerY, radius;
    int color;
    @Override
    void draw() {
       System.out.println("Ve cung tron!");
    }

    @Override
    void rotate(int angle) {
       System.out.println("Xoay cung tron 1 goc :" + angle + " do");
    }

    @Override
    void moveLeft(int point) {
       centerX-=point;
       System.out.println("Cung tron di chuyen sang Trai 1 doan:" + point);
       System.out.println("vi tri cung tron moi la:" + centerX + "," +centerY);
    }

    @Override
    void setColor(int color) {
        this.color = color;
        System.out.println("da ve cung tron voi mau:" + color);
    }
    
}
