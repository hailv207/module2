import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please choose the target temperature you want to convert to:");
            System.out.println("1. Convert Fahrenheit to Celsius.");
            System.out.println("2. Convert Celsius to Fahrenheit.");
            System.out.println("0. Exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter Fahrenheit:");
                    float fah = scanner.nextFloat();
                    System.out.printf("%.1f Fahrenheit = %.1f Celsius. %n", fah, convertToCelsius(fah));
                    break;
                case 2:
                    System.out.println("Please enter Celsius:");
                    float cel = scanner.nextFloat();
                    System.out.printf("%.1f Celsius = %.1f Fahrenheit. %n", cel, convertToFahrenheit(cel));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
        } while (choice != 0);
    }

    public static float convertToFahrenheit(float celsius) {
        float fahrenheit = celsius * ((float) 9 / 5) + 32;
        return fahrenheit;
    }

    public static float convertToCelsius(float fahrenheit) {
        float celsius = ((float) 5 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
