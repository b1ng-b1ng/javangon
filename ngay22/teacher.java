package ngay22;

public class teacher extends person {
    private String rank;
    
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public teacher(String name, String address, String department, String rank) {
        super(name, address, department);
        this.rank = rank;
    }

}
