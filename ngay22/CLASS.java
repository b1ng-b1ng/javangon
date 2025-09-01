package ngay22;

import java.util.ArrayList;

public class CLASS {
    private String name;
    ArrayList<student> studentList = new ArrayList<>();
    private teacher advisor;
    public CLASS(String name, teacher advisor) {
        this.name = name;
        this.advisor = advisor;
    }
    private int numOfStudent;
    public void addstudent(student s){
        studentList.add(s);
        numOfStudent++;
    }
    public void printList(){
        System.out.println("ten lop: " + name);
        System.out.println("ten giao vien: " + advisor.getName());
        for(student s : studentList){
            System.out.println("ten: " + s.getName() + "|dia chi: " + s.getAddress() + "|mon hoc: " + s.getDepartment());
        }
    }
}