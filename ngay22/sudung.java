package ngay22;

public class sudung {
    public static void main(String[] args) {
        System.out.println("run");
        student st1 = new student("hoang", "cao bang", "toan", "L03");
        student st2 = new student("vinh", "cao bang", "toan", "L03");
        student st3 = new student("tuan", "cao bang", "toan", "L03");
        teacher gv1 = new teacher("mai", "hanoi", "toan", "GVCN");
        CLASS lop03 = new CLASS("LO03", gv1);
        lop03.addstudent(st1);
        lop03.addstudent(st2);
        lop03.addstudent(st3);
        lop03.printList();
    }
}