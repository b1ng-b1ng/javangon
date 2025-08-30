package ngay22;

public class sudung {
    public static void main(String[] args) {
        System.out.println("run!");
        student st1 = new student("dat", "caobang", "toan", "cntt1");
        student st2 = new student("tuan", "caobang", "toan", "cntt1");
        teacher gv1 = new teacher("mai", "hanoi", "toan", "gvCN");
        CLASS lop = new CLASS("L03", gv1);
        lop.addSv(st1);
        lop.addSv(st2);
        lop.printList();
    }
}
