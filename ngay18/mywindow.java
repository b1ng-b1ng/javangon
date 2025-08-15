package ngay18;

import javax.swing.JFrame;

public class mywindow extends JFrame{
    public mywindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showIT(){
        this.setVisible(true);
    }
    public void showIT(String title){
        this.setTitle(title);
        this.setVisible(true);
    }
    public void showIT(String title,int width,int height){
        this.setTitle(title);
        this.setSize(width,height);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        mywindow m1 = new mywindow();
        m1.showIT("dat",600,400);
        mywindow m2 = new mywindow();
        m2.showIT();
        mywindow m3 = new mywindow();
        m3.showIT("thi");
    }
}
