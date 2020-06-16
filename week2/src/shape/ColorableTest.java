package shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Rectangle(4,5,"red",true);
        list[1] = new Circle(5.0,"yellow",true);
        list[2] = new Square(3,"purple",true);
        System.out.println("original object");
        for (Shape sh : list){
            System.out.println(sh.getArea());
            if (sh instanceof Square){
                ((Square) sh).howToColor("cobal");
                System.out.println(sh.getColor());
            }
        }


    }
}
