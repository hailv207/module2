import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of USD:");
        Scanner scanner = new Scanner(System.in);
        long usd = scanner.nextLong();
        System.out.printf("%,d USD = %,d VND @rate:23,000",usd,exchangeUsdToVnd(usd));
    }
    public static long exchangeUsdToVnd(long amount){
       int  rate = 23000;
       return amount * rate;
    }
}
