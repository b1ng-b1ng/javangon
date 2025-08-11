package ngay11;

import java.util.ArrayList;

public class btstring02 {
    public static void main(String[] args) {
        student2 st1 = new student2("nong dat", 01);
        student2 st2 = new student2("nguyen tung", 02);
        student2 st3 = new student2("nguyen lam", 03);
        student2 st4 = new student2("minh chien", 04);
        student2 st5 = new student2("ta duc", 05);
        ArrayList<student2> arr = new ArrayList<>();
        arr.add(st5);
        arr.add(st4);
        arr.add(st3);
        arr.add(st2);
        arr.add(st1);
        System.out.println(">> check arr: " + arr);
        for(int i = 0 ; i < arr.size();i++){
            if(arr.get(i).getName().startsWith("nguyen")){
                System.out.println("star with nguyen " + arr.get(i));
            }
        }
    }
}
