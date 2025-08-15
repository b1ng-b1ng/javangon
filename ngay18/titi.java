package ngay18;

import javax.swing.JFrame;

public class titi {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // setName
        jf.setTitle("vi du JFrame");
        //setSize
        jf.setSize(600,400);
        // gan vi chi hien thi
        jf.setLocation(300,300);
        // while (true) {
        //     System.out.println("chuong trinh dang chay!");
        // }
        // thoat ra khoi chuong trinh khi dong cua so Jframe 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hien thi
         jf.setVisible(true);
    }
}
