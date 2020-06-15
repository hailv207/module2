package shape;

public class Triangle extends Shape {
    protected double side1 = 1.0;
    protected double side2 = 1.0;
    protected double side3 = 1.0;
    public Triangle(){
    }
    public Triangle(double side1, double side2, double side3){
        if (side1 < 0 || side2 < 0 || side3 < 0 || side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1){
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
        }else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double area;
        double p = this.getPerimeter() / 2;
        area = Math.sqrt(p * (p - this.getSide1()) * (p - this.getSide2()) * (p - this.getSide3()));
        return area;
    }
    public double getPerimeter(){
        return this.getSide1() +  this.getSide2() + this.getSide3();
    }

    @Override
    public String toString() {
        return "Triangle side1 = " + this.getSide1()
                + ", side2 = " + this.getSide2()
                + ", side3 = " +  this.getSide3()
                + ". Area = " + this.getArea()
                + ", Perimeter = " + this.getPerimeter() + ".";
    }
}
