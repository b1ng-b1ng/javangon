package ngay28;

public class Cow extends Animal{
    private static int Cowpopulation =0;
    public Cow(String name){
        System.out.println("Con bo duoc tao");
        super(name);
        Cowpopulation++;
    }
    public static int getCowpopulation(){
        return Cowpopulation;
    }
    @Override
    public void makeASound(){
        System.out.println("Be be be");
    }
}
