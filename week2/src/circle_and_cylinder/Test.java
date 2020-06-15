package circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0,"white");
        Cylinder cy1 = new Cylinder(3.0,7.0);
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(cy1.toString());
        System.out.println("Surface area: " + cy1.getSurfaceArea());
        System.out.println("Volume: " + cy1.getVolume());
    }
}
