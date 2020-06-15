package circle_and_cylinder;

public class Cylinder extends Circle{
    protected double height;
    public Cylinder(){
        super();
        this.height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        this.color = "blue";
    }
    public double getSurfaceArea(){
        return this.getArea() * 2 + this.getPerimeter() * height;
    }
    public double getVolume(){
        return this.getArea() * height;
    }

    @Override
    public String toString() {
        return "This is a Cylinder with radius = " + this.getRadius() + ", and height = "
                + this.getHeight()  + ", is a subclass of " + super.toString();
    }
}
