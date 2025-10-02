package ngay32;

import java.util.Scanner;

public class Nguoi {
    private String name;
    private int namSinh;
    private int age;
    private String nghe;
    public Nguoi(){}
    public Nguoi(String name, int namSinh, String nghe) {
        this.name = name;
        this.namSinh = namSinh;
        this.nghe = nghe;
    }
    public void Nhapthongtin(Scanner sc){
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        boolean ok = false;
        while (!ok) {
            try {
                System.out.println("Nhap nam Sinh");
                namSinh = sc.nextInt(); sc.nextLine();
                if(namSinh > 2025){
                    System.out.println("Vui long nhap dung nam sinh");
                    ok = false;
                }
                else{
                age = 2025 - namSinh;
                ok = true;
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap so !!!");
            }
        }
        System.out.println("Nhap nghe nghiep:");
        nghe = sc.nextLine();
    }
    public void Inthongtin(){
        System.out.println("|Ten: " + name + "|tuoi: " + age + "|Nam sinh: " + namSinh + "|Nghe nghiep: " + nghe);
    }
}
