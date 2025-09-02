package ngay25;

import java.util.Scanner;

public class nguoi {
    private String name;
    private int age;
    private int ns;
    private String cccd;
    public nguoi(){}
    public nguoi(String name, int age, int ns, String cccd) {
        this.name = name;
        this.age = age;
        this.ns = ns;
        this.cccd = cccd;
    }
    public void nhap(Scanner sc){
        System.out.println("Nhap ho va ten:");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap nam sinh:");
        this.ns = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap can cuoc cong dan:");
        this.cccd = sc.nextLine();
    }
    public void in(){
        System.out.print("Ho va ten:" + name +"|tuoi:" + age +"|Nam sinh:" + ns + "|can cuoc cong dan:"+ cccd);
    }
}
