package class_animal_and_interface;

public class Chicken extends Animal implements Edible{
    @Override
    String makeSound() {
        return "chip chip";
    }

    @Override
    public String howToEat() {
        return "Grilled";
    }
}
