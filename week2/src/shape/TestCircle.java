package shape;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0,"red",true);
        Circle c3 = new Circle(4.0);
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c3.toString());
        System.out.println(c3.getArea());
        System.out.println(c3.getPerimeter());
    }
}
