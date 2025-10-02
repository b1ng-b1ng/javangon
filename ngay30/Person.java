package ngay30;

import ngay22.person;

public class Person {
    private String name;
    private int age;
    private double salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Person(){}
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void hienthi(){
        System.out.println("Ten:" + name + "tuoi: " + age + "luong: " + salary);
    }
}