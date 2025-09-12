package ngay28;

abstract class Animal {
    private String name;
    private static int population = 0;
    public Animal(String name) {
        this.name = name;
        population++;
    }
    abstract void makeASound();
    public void introduce(){
        System.out.println("Ten toi la:" + name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getPopulation() {
        return population;
    }
    public static void setPopulation(int population) {
        Animal.population = population;
    }
}
