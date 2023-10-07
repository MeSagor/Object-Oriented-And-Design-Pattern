import java.util.ArrayList;
import java.util.List;

public class Floor implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Floor(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void enter() {
        System.out.println("Entered floor: " + name);
        for (HousingStructure structure : structures) {
            structure.enter();
        }
    }
}
