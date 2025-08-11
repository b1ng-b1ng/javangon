package ngay11;

public class student2 {
    @Override
    public String toString(){
        return "Student [name=" + name + ", id=" + id +"]";
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int id;
    student2(){

    }
    student2(String name,int id){
        this.name = name;
        this.id = id;
    }
}
