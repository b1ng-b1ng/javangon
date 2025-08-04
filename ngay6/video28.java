package ngay6;

public class video28 {
    public static void main(String[] args) {
        System.out.println("run video 28");
        System.out.println("run video 26");
        student st1 = new student();
        student st2 = new student("dat",10);
        st2.setName("hoang cuu bao"); // cap nhat lai gia tri bien name;
        System.out.println("check obj " + st2.getName()+" and age: " + st2.getAge());
    }
}
