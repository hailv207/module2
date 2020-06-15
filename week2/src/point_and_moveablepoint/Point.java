package point_and_moveablepoint;

public class Point {
    protected float x;
    protected float y;
    public Point(){
        this.x = 1;
        this.y = 1;
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] result = new float[2];
        result[0] = this.getX();
        result[1] = this.getY();
        return result;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
}
