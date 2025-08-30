package ngay22;

import java.util.ArrayList;

public class CLASS {
    private String name;
    public ArrayList<student> studentList = new ArrayList<>();
    private int numOfStudent;
    private teacher advisor;

    public CLASS(String name, teacher advisor) {
        this.name = name;
        this.advisor = advisor;
    }
    public void addSv(student st){
        studentList.add(st);
        numOfStudent++;
    }
    public void printList(){
        System.out.println("lop: " + name );
        System.out.println("giao vien chu nhiem: " + advisor.name);
        System.out.println("danh sach sinh vien: ");
        for (int i = 0; i < numOfStudent; i++) {
            student st = studentList.get(i);
            System.out.println("-ten: " + st.name + "| que quan: " + st.address + "| bo mon: " + st.department);
        }
    }
}
