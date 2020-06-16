package shape;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(7.0);
        circles[1] = new Circle(6.0);
        circles[2] = new Circle(5.0);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("after-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
