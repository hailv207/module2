package shape;

public class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String filled = "not filled";
        if (this.filled){
            filled = "filled";
        }
        return "A Shape with color of" + this.color + " and " + filled;
    }
}
