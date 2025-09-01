package ngay23;

import java.util.Scanner;

public class Kysu extends Canbo {
    private String daotao;
    public Kysu(){
        super();
    }
    public Kysu(String ten, int ns, String sex, String address, String daotao) {
        super(ten, ns, sex, address);
        this.daotao = daotao;
    }
    @Override
    public void nhap(Scanner sc){
        System.out.print("nhap nganh dao tao: ");
        this.daotao = sc.nextLine();

    }
    @Override
    public void in(){
        System.out.println("nganh dao tao: " + daotao);
    }
}
