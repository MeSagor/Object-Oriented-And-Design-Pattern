public class CompositePatternExample {
    public static void main(String[] args) {
        HousingStructure room1 = new Room("Drawing Room");
        HousingStructure room2 = new Room("Bedroom1");
        HousingStructure room3 = new Room("Bedroom2");
        HousingStructure room4 = new Room("Kitchen");
        HousingStructure room5 = new Room("Bathroom");

        Unit unit1 = new Unit("A");
        unit1.addStructure(room1);
        unit1.addStructure(room2);
        unit1.addStructure(room3);
        unit1.addStructure(room4);
        unit1.addStructure(room5);

        Unit unit2 = new Unit("B");
        unit2.addStructure(room1);
        unit2.addStructure(room2);
        unit2.addStructure(room3);
        unit2.addStructure(room4);
        unit2.addStructure(room5);

        Floor floor1 = new Floor("First Floor");
        floor1.addStructure(unit1);
        floor1.addStructure(unit2);

        Floor floor2 = new Floor("Second Floor");
        floor2.addStructure(unit1);
        floor2.addStructure(unit2);

        Building building = new Building("Sagor-Building");
        building.addStructure(floor1);
        building.addStructure(floor2);

        building.enter();
    }
}
