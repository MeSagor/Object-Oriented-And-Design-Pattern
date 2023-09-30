import java.util.ArrayList;
import java.util.List;

public class Owner implements Cage{
    private List<Pet> pets = new ArrayList<>();

    @Override
    public void addPet(Pet animal) {
        pets.add(animal);
    }

    @Override
    public void removePet(Pet animal) {
        pets.remove(animal);
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
