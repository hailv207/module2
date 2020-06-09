import sun.plugin2.main.client.DisconnectedExecutionContext;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] array = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name:");
        String name = scanner.nextLine();
        if (findValueInArray(name, array)) {
            System.out.printf("Name %s is exist.", name);
        } else {
            System.out.printf("Name %s is not exist.", name);
        }
    }

    public static boolean findValueInArray(String string, String[] array) {
        boolean isExist = false;
        for (String i : array) {
            if (string.equals(i)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}
