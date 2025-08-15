package ngay16;

public class Person implements IPerson {
    protected String name;
    protected int age;
    protected int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    @Override
    public void input() {
       
    }
    @Override 
    public void display() {
       
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
