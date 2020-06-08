import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Please enter the year you want to check Leap Year");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (year > 0) {
            if ((isDivisibleBy4 && !isDivisibleBy100) || (isDivisibleBy100 && isDivisibleBy400)) {
                isLeapYear = true;
            }
            System.out.printf("Leap Year checking result of %d: %B", year, isLeapYear);
        } else {
            System.out.println("Invalid Year.");
        }
    }
}
