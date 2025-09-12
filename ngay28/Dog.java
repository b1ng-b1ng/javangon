package ngay28;

public class Dog extends Animal {
    private static int Dogpopulation = 0;
    public Dog(String name){
        System.out.println("Con Cho duoc tao");
        super(name);
        Dogpopulation++;
    }
    @Override
    public void makeASound(){
        System.out.println("Gau Gau Gau");
    }
    public static int getDogpopulation() {
        return Dogpopulation;
    }
    public void setDogpopulation(int dogpopulation) {
        Dogpopulation = dogpopulation;
    }
}
