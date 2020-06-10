import java.util.Scanner;

public class SumMainCrossLine {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size:");
        size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.printf("Please enter the value of Array[%d][%d]:%n",i,j);
                array[i][j] = scanner.nextInt();
            }

        }
        System.out.println("You've entered an array:");
        for (int i = 0; i < array.length;i++){
            DeleteValueFromArray.displayIntArray(array[i]);
        }
        System.out.printf("Sum of Main cross line of Array is: %d." , sumMainCrossLine(array));
    }
    public static int sumMainCrossLine(int[][] array){
        int sum=0;
        for (int i = 0; i < array.length;i++){
                sum += array[i][i];
            }
        return sum;
    }
}
