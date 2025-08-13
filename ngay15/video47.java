package ngay15;
class Animal{
    void eat(){
        System.out.println("an ngon ngon");
    }
}
class Dog extends Animal{
    // void eat (){
    //     System.out.println("dong vat dang an!");
    // }
}
class Cat extends Animal{
    void eat (){
        System.out.println("con meo dang an!");
    }
}
public class video47 {
    public static void main(String[] args) {
        System.out.println("Run video 47!");
        Animal dv1 = new Cat();
        dv1.eat();
    }
}
