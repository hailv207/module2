import java.util.Scanner;

public class PrimeChecking {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer number:");
        number = scanner.nextInt();
        System.out.printf("Prime checking result of %d: " + isPrime(number), number);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
