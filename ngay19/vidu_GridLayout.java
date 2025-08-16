package ngay19;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class vidu_GridLayout extends JFrame  {
    public vidu_GridLayout (){
        this.setTitle("vidu_GridLayout");
        this.setSize(600,400);
        // can giua cua so chuong trinh
        this.setLocationRelativeTo(null);
        // setLayout
        GridLayout GridLayout = new GridLayout();
        GridLayout GridLayout_1 = new GridLayout(4,4);
        GridLayout GridLayout_2 = new GridLayout(4,4,25,25);
        this.setLayout(GridLayout_2);
        // JButton jButton_1 = new JButton("1");
        // JButton jButton_2 = new JButton("2");
        // JButton jButton_3 = new JButton("3");
        // add thanh phan
        for(int i = 0; i < 16; i++){
            JButton jbutton = new JButton(i + " ");
            this.add(jbutton);
        }
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new vidu_GridLayout ();
    }
}

