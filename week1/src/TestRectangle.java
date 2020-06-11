import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class TestRectangle {
    public static void main(String[] args) {
        double width, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter width:");
        width = scanner.nextDouble();
        System.out.println("Please enter height:");
        height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Info:");
        System.out.println(rectangle.display());
        System.out.println("Area:");
        System.out.println(rectangle.getArea());
        System.out.println("Perimeter:");
        System.out.println(rectangle.getPerimeter());
    }
}
