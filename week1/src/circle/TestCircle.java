package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("circle1.color: " + circle1.getColor());
        System.out.println("circle1.radius: " + circle1.getRadius());
        Circle circle2 = new Circle(5.0);
        System.out.println("circle2.color: " + circle2.getColor());
        System.out.println("circle2.radius: " + circle2.getRadius());
    }
}
