package ngay16;

public class Sinhvien extends Person {
    private String grade;
    private int mark;
      public Sinhvien(String name, int age, int id, String grade, int mark) {
        super(name, age, id);
        this.grade = grade;
        this.mark = mark;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade() {
       if(this.mark >= 8) this.grade = "A";
       if(this.mark >= 7 && this.mark < 8 ) this.grade = "B";
       if(this.mark >= 6 && this.mark < 7) this.grade = "C";
       if(this.mark >= 5 ) this.grade = "D";
       if(this.mark < 5) this.grade = "tach cmnr!";
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    
}   
