package ngay5;

import java.util.Arrays;
import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
    int size;
    Scanner nhap = new Scanner(System.in);
    System.out.print("Moi ban nhap so phan tu cua mang: ");
    size = nhap.nextInt();
    int[] a = new int[size];
    System.out.println("Vui long nhap cac phan tu cua mang: ");
    for(int i = 0; i < size ; i++){
        a[i] = nhap.nextInt();
    }
    Arrays.sort(a);
    System.out.println("Phan tu lon nhat mang la: " + a[size - 1]);
    System.out.println("Phan tu nho nhat mang la: " + a[0]);
    nhap.close();
    }
}
