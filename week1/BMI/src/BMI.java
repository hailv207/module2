import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight (kg):");
        weight = scanner.nextFloat();
        System.out.println("Please enter your height (m):");
        height = scanner.nextFloat();

        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.printf("BMI = %.2f: Underweight.", bmi);
        } else if (bmi < 25) {
            System.out.printf("BMI = %.2f: Normal.", bmi);
        } else if (bmi < 30) {
            System.out.printf("BMI = %.2f: Overweight.", bmi);
        } else {
            System.out.printf("BMI = %.2f: Obese.", bmi);
        }
    }
}
