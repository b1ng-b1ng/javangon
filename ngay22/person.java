package ngay22;

public class person {
    private String name;
    private String address;
    private String department;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public person(){
        
    }
    public person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }
    public void print(){
        System.out.println("ten: " + name);
        System.out.println("dia chi: " + address);
        System.out.println("bo mon: " + department);
    }
}