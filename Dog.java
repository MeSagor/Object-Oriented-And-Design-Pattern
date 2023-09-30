public class Dog implements Pet {
    private String name;
    private String species;

    public Dog(String name) {
        this.name = name;
        this.species = "Dog";
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
