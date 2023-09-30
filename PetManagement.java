public class PetManagement {
    public static void main(String[] args) {
        Pet dog1 = new Dog("Buddy");
        Pet dog2 = new Dog("Duke");
        Pet cat1 = new Cat("Rosie");

        Owner owner = new Owner();

        owner.addPet(dog1);
        owner.addPet(cat1);
        owner.addPet(dog2);

        owner.feedPets();
        owner.playWithPets();
        owner.checkPetsHealth();

        owner.removePet(cat1);

        owner.feedPets();
        owner.playWithPets();
        owner.checkPetsHealth();
    }
}