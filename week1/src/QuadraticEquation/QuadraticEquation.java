package QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;
    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    public double getRoot1(){
        if (this.getDiscriminant() >= 0){
            return -this.b - Math.sqrt(this.getDiscriminant()) / 2 / this.a;
        }else {
            return 0;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant() >= 0){
            return -this.b + Math.sqrt(this.getDiscriminant()) / 2 / this.a;
        }else {
            return 0;
        }
    }
    public QuadraticEquation(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
