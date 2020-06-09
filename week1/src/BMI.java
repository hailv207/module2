
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight (kg):");
        weight = scanner.nextFloat();
        System.out.println("Please enter your height (m):");
        height = scanner.nextFloat();
        System.out.println(checkBMI(weight,height));
    }

    public static String checkBMI(float weight, float height) {
        float bmi;
        String result;
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            result = "BMI = " + bmi + ": Underweight.";
        } else if (bmi < 25) {
            result = "BMI = " + bmi + ": Normal.";
        } else if (bmi < 30) {
            result = "BMI = " + bmi + ": Overweight.";
        } else {
            result = "BMI = " + bmi + ": Obese.";
        }
        return result;
    }
}
