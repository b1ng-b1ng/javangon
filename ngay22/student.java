package ngay22;

public class student extends person{
    private String lop;

    public student(String name, String address, String department, String lop) {
        super(name, address, department);
        this.lop = lop;
    }

}