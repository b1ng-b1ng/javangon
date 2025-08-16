package ngay19;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class vidu_FlowLayout extends JFrame {
    public vidu_FlowLayout(){
        this.setTitle("vidu_FlowLayout");
        this.setSize(600,400);
        // can giua cua so chuong trinh
        this.setLocationRelativeTo(null);
        // setLayout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.CENTER,50,50);
        FlowLayout flowLayout_2 = new FlowLayout();
        this.setLayout(flowLayout_1);
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        // add thanh phan
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new vidu_FlowLayout();
    }
}
