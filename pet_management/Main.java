public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner();

        Pet cat = new Cat("Kitty");
        Pet dog = new Dog("Doggy");

        owner.addPet(cat);
        owner.addPet(dog);

        owner.feedPets();
        owner.playWithPets();
        owner.checkPetsHealth();

        owner.removePet(cat);

        owner.feedPets();
        owner.playWithPets();
        owner.checkPetsHealth();
    }
}
