package ngay8;

import java.util.ArrayList;

public class video33 {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<String> a1 = new ArrayList<>(); // generic , java diamond tu doan
        a1.add("nong");
        a1.add("duc");
        a1.add("dat");
        System.out.println("Run video 33");
        System.out.println(a1.toString()+ " " + a1.get(1));
    }
}
