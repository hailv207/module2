package point_and_moveablepoint;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        System.out.println(p1.toString());
        MoveablePoint p2 = new MoveablePoint(1,1);
        System.out.println(p2.toString());
        p2.setSpeed(2,2);
        System.out.println(p2.toString());
        System.out.println(p2.move().toString());

    }
}
