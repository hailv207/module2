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
        float x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("The Equation has coutless root");
            } else {
                System.out.println("The Equation has no root");
            }
        } else {
            if (b == 0) {
                x = 0;
            } else {
                x = -b/a;
            }
            System.out.println("The root is: " + x);
        }
    }
}
