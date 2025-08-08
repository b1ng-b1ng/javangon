package ngay11;

import java.util.ArrayList;

import ngay4.array;

public class btstring02 {
    public static void main(String[] args) {
        student2 st1 = new student2("dat", 01);
        student2 st2 = new student2("tung", 02);
        student2 st3 = new student2("lam", 03);
        student2 st4 = new student2("chien", 04);
        student2 st5 = new student2("duc", 05);
        ArrayList<student2> arr = new ArrayList<>();
        arr.add(st5);
        arr.add(st4);
        arr.add(st3);
        arr.add(st2);
        arr.add(st1);
        System.out.println(">> check arr: " + arr);
    }
}
