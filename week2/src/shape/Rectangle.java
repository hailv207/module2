package shape;

import com.sun.corba.se.impl.encoding.CDROutputObject;
import sun.jvm.hotspot.types.JDoubleField;

public class Rectangle extends Shape{
protected double width;
protected double length;
public Rectangle(){
    this.width = 1.0;
    this.length = 1.0;
}
public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
}
public Rectangle(double width, double length,String color,boolean filled){
    super(color,filled);
    this.width = width;
    this.length = length;
}
protected double getArea(){
    return this.width * this.length;
}
protected double getPerimeter(){
    return this.width * 2 + this.length * 2;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + this.getWidth()
                + " and length=" + this.getLength()
                + ", which is a subclass of " + super.toString();
    }
}
