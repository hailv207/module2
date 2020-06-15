package class_animal_and_interface;

public class Tiger extends Animal implements Edible{
    @Override
    String makeSound() {
        return "GRAO GRAO";
    }

    @Override
    public String howToEat() {
        return "Take their bone";
    }
}
