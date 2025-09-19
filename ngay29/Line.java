package ngay29;

public class Line extends Shape {
    int x1 , y1, x2 , y2 ;
    int color;
    @Override
    public void draw(){
        System.out.println("draw in line");
    }
    @Override
    public void rotate(int angle){
        System.out.println("Xoay duong thang " + angle + " do");
    }
    @Override
    public void moveLeft(int point){
        // di chuyen sang trai toa do Y khong doi
        x1-=point;
        x2-=point;
        System.out.println("Move Line " + point + " points to the left");

    }
    @Override
    public void setColor(int color){
        this.color = color;
        System.out.println("da ve duong thang voi mau:" + color);
    }
}
