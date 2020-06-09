import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        long usd;
        int rate = 23000;
        long vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount in USD:");
        usd = scanner.nextLong();
        vnd = usd * rate;
        System.out.printf("%,d USD = %,d VND", usd,vnd);
    }
}
