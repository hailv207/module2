package circle_and_cylinder;

public class Circle {
    protected double radius;
    protected String color;
    public Circle(){
        this.radius = 1.0;
        color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "This is a circle with radius = " + this.getRadius();
    }
}
