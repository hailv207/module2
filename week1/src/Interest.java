import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        long amount;
        int month;
        float rate;
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter the amount of money (VND):");
        amount = input.nextLong();
        System.out.println("Please enter how many months you want to deposit (months):");
        month = input.nextInt();
        System.out.println("Please enter the interest rate (%/year):");
        rate = input.nextFloat();
        System.out.printf("The total interest you will get: %,d.",calculateInterest(amount,month,rate));
    }
    public static long calculateInterest(long amount, int month, float rate){
        return Math.round(amount * rate / 100 / 12 * month);
    }
}
