package ngay11;

import java.util.Scanner;

public class btstring01 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String userName;
        String userPass;

        do {
            System.out.printf("Nhap username: ");
            userName = nhap.nextLine();

            System.out.printf("Nhap password: ");
            userPass = nhap.nextLine();

            if (userName.equals("dat") && userPass.length() >= 6) {
                System.out.println("Tai khoan hop le");
            } else {
                System.out.println("Tai khoan khong hop le!");
            }

        } while (!(userName.equals("dat") && userPass.length() >= 6)); // Lặp lại nếu chưa hợp lệ

        nhap.close();
    }
}
