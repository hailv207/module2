package QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a:");
        a = scanner.nextDouble();
        System.out.println("Please enter b:");
        b = scanner.nextDouble();
        System.out.println("Please enter c:");
        c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Delta: ");
        System.out.println(equation.getDiscriminant());
        if (equation.getDiscriminant()>0){
            System.out.println("Root1:");
            System.out.println(equation.getRoot1());
            System.out.println("Root2:");
            System.out.println(equation.getRoot2());
        }else if (equation.getDiscriminant() == 0){
            System.out.println("The equation has one root:");
            System.out.println(equation.getRoot1());
        }else {
            System.out.println("The equation has no root.");
        }

    }
}
