package class_animal_and_interface;

public class Orange extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "can eat directly";
    }
}
