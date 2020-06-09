import java.util.Scanner;

public class sumSpecificColumnOfArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println("The array:");
        for (int i = 0;i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        int column;
        do {
            System.out.println("Please enter the column you want to sum:");
            Scanner scanner = new Scanner(System.in);
            column = scanner.nextInt();
        } while (column < 0 || column > array[0].length);
        int sum = sumSpecificColumn(array, column);
        System.out.printf("Sum of column %d is: %d.", column, sum);
    }

    public static int sumSpecificColumn(int[][] array, int column) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
}
