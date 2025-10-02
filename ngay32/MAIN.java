package ngay32;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho kp = new KhuPho();
        kp.Nhapthongtin(sc);
        kp.Inthongtin();
    }
}
