package ngay22;

public class person {
     String name;
     String address;
     String department;
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
        System.out.println("nghe nghiep: " + department);

    }
}