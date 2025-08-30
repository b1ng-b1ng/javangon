package ngay21;

import java.util.Arrays;
import java.util.Scanner;

public class arrngon {
    public static boolean ngto(int n){
        if( n < 2) return false;
        for(int i = 2; i<= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap gia tri can tim:");
        int x = sc.nextInt();
        for(int i = 0 ; i < n;i++){
            a[i] = sc.nextInt();
        }
        double max = -1e9;
        double min = 1e9;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min  = a[i];
            }
        }
        int cnt =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 ==0){
            cnt++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(ngto(i)){
                System.out.print(i + " ");
            }
        }
        for ( int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
      
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x){
                System.out.println("gia tri can tim day:" + x);
            }
        }
        Arrays.sort(a);
        System.err.println("gia tri min " + min + " gia tri max: " + max );
        System.out.println("so gia tri la chan : " + cnt );
        sc.close();
    }
}