package point_and_moveablepoint;

public class MoveablePoint extends Point {
    protected float speedX = 0.0f;
    protected float speedY = 0.0f;
    public MoveablePoint(){
        super();
    }
    public MoveablePoint(float x, float y){
        super(x,y);
    }

    public float getSpeedX() {
        return speedX;
    }

    public void setSpeedX(float speedX) {
        this.speedX = speedX;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }
    public void setSpeed(float speedX, float speedY){
        this.setSpeedX(speedX);
        this.setSpeedY(speedY);
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = this.getSpeedX();
        result[1] = this.getSpeedY();
        return result;
    }

    @Override
    public String toString() {
        String string = new String();
        string = "X: " + this.getX() + ", Y: " + this.getY()
                + ". Speed = (" + this.getSpeedX() + ", "
                + this.getSpeedY() + ")";
        return string;
    }
    public MoveablePoint move(){
        this.setX(this.getX() + this.getSpeedX());
        this.setY(this.getY() +  this.getSpeedY());
        return this;
    }
}
