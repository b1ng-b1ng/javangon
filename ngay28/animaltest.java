package ngay28;

public class animaltest {
    public static void main(String[] args) {
        Cat meo1 = new Cat("xi");
        meo1.makeASound();
        meo1.introduce();
        Cow bo1 = new Cow("baby");
        bo1.makeASound();
        bo1.introduce();
        Dog cho1 = new Dog("xiaxia");
        Dog cho2 = new Dog("nam");
        System.out.println("So cho la:" + Dog.getDogpopulation());
        System.out.println("So dong vat la:" + Animal.getPopulation());
    }
}
