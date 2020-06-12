package circle;

public class Circle {
    private double radius = 1;
    private String color = "blue";
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
