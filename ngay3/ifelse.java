package ngay3;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("moi ban nhap luong cua minh: = ");
        int luong = nhap.nextInt();
        if(luong < 10){
            System.out.println("khong dong thue!");
        }
        else if(luong >= 10 && luong <= 15){
            System.out.println("thue 10%!");
        }
        else if(luong > 15 && luong < 30 ){
            System.out.println("thue 20%!");
        }
        else if(luong >=30){
            System.out.println("thue 30%!");
        }
        nhap.close();
    }
}
