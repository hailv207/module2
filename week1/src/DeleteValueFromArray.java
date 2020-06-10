import java.util.Scanner;

public class DeleteValueFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The original Array:");
        displayIntArray(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value you want to delete:");
        int value = scanner.nextInt();
        deleteValueFromArray(value,array);
        System.out.println("The new Array:");
        displayIntArray(array);

    }

    public static void deleteValueFromArray(int value, int[] array) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                delIndex = i;
            }
        }
        if (delIndex < array.length || delIndex > 0) {
            for (int i = delIndex; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
        }
    }
    public static void displayIntArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
