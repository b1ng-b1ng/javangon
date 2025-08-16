package ngay19;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class vidu_BorderLayout extends JFrame {
    public vidu_BorderLayout(){
        this.setTitle("vidu_BorderLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        // setLayout
        BorderLayout flowLayout = new BorderLayout();
        BorderLayout flowLayout_1 = new BorderLayout();
        BorderLayout flowLayout_2 = new BorderLayout(15,15);
        this.setLayout(flowLayout_2);
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        // add thanh phan
        this.add(jButton_1, BorderLayout.NORTH);
        this.add(jButton_2, BorderLayout.SOUTH);
        this.add(jButton_3, BorderLayout.WEST);
        this.add(jButton_4, BorderLayout.EAST);
        this.add(jButton_5, BorderLayout.CENTER);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new vidu_BorderLayout();
    }
}
