import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        float a, b;
        System.out.println("Simple Equation Solver");
        System.out.println("Give a simple equation ax + b = 0. Please enter a.");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        System.out.println("Please enter b.");
        b = scanner.nextFloat();
        System.out.println(solveSimpleEquation(a,b));
    }

    public static String solveSimpleEquation(float a, float b) {
        String x;
        if (a == 0) {
            if (b == 0) {
                x = "Countless root";
            } else {
                x = "No root";
            }
        } else {
            if (b == 0) {
                x = "0";
            } else {
                x = "The root is: " + -b/a;
            }
        }
        return x;
    }
}
