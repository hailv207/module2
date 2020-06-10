import java.util.Scanner;

public class InsertValueIntoArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The original Array:");
        DeleteValueFromArray.displayIntArray(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value:");
        int value = scanner.nextInt();
        System.out.println("Please enter the index your want to insert value:");
        int index = scanner.nextInt();
        insertValueIntoArray(value, index, array);
        System.out.println("The new Array:");
        DeleteValueFromArray.displayIntArray(array);
    }

    public static void insertValueIntoArray(int value, int index, int[] array) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("The index is not in Array.");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        }
    }
}
