import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = scanner.nextLine();
        System.out.println(greet(name));
    }
    public static String greet(String name){
        return "Hello " + name;
    }
}
