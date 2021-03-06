package shape;

public class Circle extends Shape implements Resizeable {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    protected double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.getRadius() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        if (percent >= 0 && percent <= 200) {
            this.setRadius(this.getRadius() * percent / 100);
        }
    }
}
