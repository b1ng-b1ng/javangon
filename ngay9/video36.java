package ngay9;

import java.util.ArrayList;
import java.util.Scanner;

public class video36 {
    public static void main(String[] args) {
        System.out.println("Run video 36!");
        System.out.printf("Nhap vao 1 so thuc bat ky: ");
        Scanner nhap = new Scanner(System.in);
        ArrayList<Double> arrNumber = new ArrayList();
        while(true){
            double input = nhap.nextDouble();
            arrNumber.add(input);
            nhap.nextLine();
            System.out.print("continue ? Y or N ???");
            String option = nhap.nextLine();
            if(option.equals("N") || option.equals("n")){
                break;
            }
        }
        System.out.println("Check array: " + arrNumber);
        nhap.close();
    }   
}
