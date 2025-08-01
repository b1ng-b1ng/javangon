package ngay4;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] a = {1,5,4,8,10};
        System.out.println("Mang a truoc khi sap xep" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mang a sau khi sap xep" + Arrays.toString(a));
    }
}
