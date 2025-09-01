package ngay22;

public class teacher extends person{
    private String rank;

    public teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank = rank;
    }

}