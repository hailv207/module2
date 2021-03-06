package Rectangle;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public String display(){
        return "Rectangle.Rectangle{width: " + this.width + ", height: " + this.height + "}";
    }
}
