import java.util.Scanner;

public class bttonghop {
    public static void main(String[] args) {
        
        Scanner nhap = new Scanner(System.in);
        System.out.println(">> LUA CHON TINH NANG <<");
        System.out.println("++--------------------++");
        System.out.println("|1.Giai pt bac 1       |");
        System.out.println("|2.Giai pt bac 2       |");
        System.out.println("|3.Tinh so tien dien   |");
        System.out.println("|4.Ket thuc            |");
        System.out.println("++--------------------++");
        System.out.print("Lua chon cua ban: ");
        int x = nhap.nextInt();
        switch (x) {
            case 1:
                // giai pt bac nhat
                btlab02.main(new String[0]);
                break;
            case 2:
            //giai pt bac hai
            btlap03.main(new String[0]);
            break;
            case 3:
            // tinh tien dien
            tiendien.main(new String[0]);
            break;
            default:
             System.out.println(">> BAN DA THOAT CHUONG TRINH <<");
            System.exit(0);
                break;
        }
        nhap.close();
    }
}
