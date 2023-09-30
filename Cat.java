public class Cat implements Pet {
    private String name;
    private String species;

    public Cat(String name) {
        this.name = name;
        this.species = "Cat";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public void eat() {
        System.out.println(name + "(" + species + ") is eating.");
    }

    @Override
    public void play() {
        System.out.println(name + "(" + species + ") is playing.");
    }

    @Override
    public void Health() {
        System.out.println("Health checking of "+name + "(" + species + ").");
    }
}
