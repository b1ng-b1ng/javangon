package ngay22;

public class student extends person {
    private String className;

    public student(String name, String address, String department, String className) {
        super(name, address, department);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
