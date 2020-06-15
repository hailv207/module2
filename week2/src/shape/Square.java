package shape;

public class Square extends Rectangle {
    public Square(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Square(double size){
        this.length = size;
        this.width = size;
    }
    public Square(double size, String color, boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
        return this.getWidth();
    }
    public void setSize(double size){
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + this.getSize() + ", which is a subclass of " + super.toString();
    }
}
