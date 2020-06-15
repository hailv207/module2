package shape;

public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square();
        Square sq2 = new Square(4.0);
        Square sq3 = new Square(5.0,"black",true);
        System.out.println(sq1.toString());
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(sq2.toString());
        System.out.println(sq2.getArea());
        System.out.println(sq2.getPerimeter());
        System.out.println(sq3.toString());
        System.out.println(sq3.getArea());
        System.out.println(sq3.getPerimeter());
        sq3.setSize(7.0);
        System.out.println(sq3.toString());
        sq3.setWidth(8.0);
        System.out.println(sq3.toString());

    }
}
