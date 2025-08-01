package ngay4;
// khai bao , cac method trong array;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String [] food = {"com","cha","pho"};
        System.out.println("phan tu dau tien cua mang: " + food[0]);
        food[0] = "canh";
        System.out.println("Run here array" + Arrays.toString(food));
        System.out.println("Phan tu dau tien cua mang sau khi gan lai : " + food[0]);
        System.out.println("Do dai cua mang la: "+ food.length);
        // // khai bao mang
        // int[] a;
        // int[] b = new int[4];
    }
}
