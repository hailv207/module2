package shape;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0,6.0);
        Rectangle r3 = new Rectangle(5.0,8.0,"blue",false);
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r3.toString());
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());
    }
}
