package ngay28;

public class Cat extends Animal {
    private  static int Catpopulation =0;
    
    public Cat(String name){
        System.out.println("Con meo duoc tao");
        super(name);
        Catpopulation++;
    }
    @Override
    public void makeASound(){
        System.out.println("Meo Meo Meo");
    }
    public static int getCatpopulation() {
        return Catpopulation;
    }
    public void setCatpopulation(int catpopulation) {
        Catpopulation = catpopulation;
    }
}
