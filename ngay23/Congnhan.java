package ngay23;

import java.util.Scanner;

public class Congnhan extends Canbo{
    private String rank;
    public Congnhan(){
        super();
    }
    public Congnhan(String ten, int ns, String sex, String address, String rank) {
        super(ten, ns, sex, address);
        this.rank = rank;
    }
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("nhap bac: ");
        this.rank = sc.nextLine();
    }

    @Override
    public void in(){
        System.out.print("|Cong nhan");
        super.in();
        System.out.println("*Bac: "+ rank +"/7");
    }
}
