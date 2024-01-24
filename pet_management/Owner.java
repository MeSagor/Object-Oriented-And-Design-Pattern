import java.util.ArrayList;
import java.util.List;

public class Owner implements PetManagement {
    private List<Pet> pets = new ArrayList<>();

    @Override
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    @Override
    public void feedPets() {
        System.out.println("Feeding all pets:");
        for (Pet pet : pets) {
            pet.eat();
        }
    }

    @Override
    public void playWithPets() {
        System.out.println("Playing with all pets:");
        for (Pet pet : pets) {
            pet.play();
        }
    }

    @Override
    public void checkPetsHealth() {
        System.out.println("Checking health of all pets:");
        for (Pet pet : pets) {
            pet.Health();
        }
    }
}
