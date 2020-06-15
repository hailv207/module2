package point2D_and_point3D;

public class Point2D {
    protected float x;
    protected float y;
    public Point2D(){
        this.x = 1;
        this.y = 1;
    }
    public Point2D(float x, float y){
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
    public final void setXY(float x, float y){
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY(){
        float[] result =new float[2];
        result[0] = this.getX();
        result[1] = this.getY();
        return result;
    }

    @Override
    public String toString() {
        return "2DPoint X: " + this.getX() + ", Y: " + this.getY();
    }
}
