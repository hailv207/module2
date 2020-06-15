package point2D_and_point3D;

public class Point3D extends Point2D {
    protected float z;
    public Point3D(){
        super(1,1);
        this.z = 1;
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = this.getX();
        result[1] = this.getY();
        result[2] = this.getZ();
        return result;
    }

    @Override
    public String toString() {
        return "3DPoint X: " + this.getX()
                + ", Y: " + this.getY() + ", Z: " + this.getZ()
                + ", a subclass of " + super.toString();
    }
}
