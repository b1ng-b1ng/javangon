package ngay6;

public class student {
     // class attributes
    private String name;
    private int age;
    public student(){

    }
    //nếu khai báo không có public
    // student(){

    // }
    //java mặc định là có public rùi
    /*java mặc định luôn có hàm tạo public student() nếu không có hàm tạo được tạo ví dụ
     * bạn đã tạo hàm public student (string name ,int age)() thì bạn cần khai báo thêm public student để rỗng cx được nếu không nó sẽ báo lỗi
     */
    public student(String name1,int age1){
        this.name = name1;
        //this là cái class ở trên thui;
        this.age = age1;
    }
    public String getName(){
        return "nhan vat bi an: " + this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name1){
                this.name = name1;
    }
    // //Nguyên tắc lạc đà 
    // String fullName;
    // String emailAddress;
    // // class method
    void learnjava(){
        System.out.println("learn java with b1ngb1ng!");
    }
    void learnjava(int a){
        System.out.println("learn java with b1ngb1ng!");
    }
}
