import java.util.Scanner;

public class findMinValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter the size of array (min: 1, max: 20):");
            size = scanner.nextInt();
        } while (size < 1 || size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Please enter the value of array[%d]:", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("The smallest value is: " + findMinValueInArray(array));
    }
    public static long findMinValueInArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
