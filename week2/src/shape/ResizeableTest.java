package shape;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(4);
        System.out.println("C1 area: " + c1.getArea());
        System.out.println("C2 area: " +c2.getArea());
        Rectangle rec1 = new Rectangle(4,5);
        Rectangle rec2 = new Rectangle(7,8);
        System.out.println("Rec1 area: " +  rec1.getArea());
        System.out.println("Rec2 area: " +  rec2.getArea());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the percent to resize all shape (0-200):");
        double resizer = scanner.nextDouble();
        c1.resize(resizer);
        c2.resize(resizer);
        rec1.resize(resizer);
        rec2.resize(resizer);
        System.out.println("After resize with resizer = " + resizer + "%:");
        System.out.println("C1 area: " + c1.getArea());
        System.out.println("C2 area: " +c2.getArea());
        System.out.println("Rec1 area: " +  rec1.getArea());
        System.out.println("Rec2 area: " +  rec2.getArea());
    }
}
