public class Room implements HousingStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("Entered room: " + name);
    }
}
