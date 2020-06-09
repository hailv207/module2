import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        long a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        a = scanner.nextLong();
        System.out.println("Please enter the second number:");
        b = scanner.nextLong();
        System.out.printf("The Greatest Common Divisor is: %,d", findGreatestCommonDivisor(a, b));
    }

    public static long findGreatestCommonDivisor(long a, long b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
