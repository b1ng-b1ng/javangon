package ngay6;

public class student {
     // class attributes
    String name;
    int age;
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
    String getAge(){
        // return 25;
        return "hoi dan IT";
    }
    // void chỉ in ra thui 
}
