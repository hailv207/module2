package class_animal_and_interface;

public class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "can make apple juice";
    }
}
