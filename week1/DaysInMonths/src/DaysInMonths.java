import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month you want to know the number of days");
        month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                break;
        }
        if (daysInMonth == "") {
            System.out.println("Invalid month");
        } else {
            System.out.println("The month " + month + " has " + daysInMonth + " days");
        }
    }
}

