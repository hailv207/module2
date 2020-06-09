import java.util.Scanner;

public class findMaxValue {
    public static void main(String[] args) {
        int size;
        int[] assetValueList;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of Billionaires (min: 1, max: 20):");
            size = scanner.nextInt();
        } while (size < 1 || size > 20);
        assetValueList = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Please enter the Asset value of Billionaire %d:", i);
            assetValueList[i] = scanner.nextInt();
        }
        System.out.println("The greatest asset value is: " + findMaxValueInArray(assetValueList));
    }


    public static long findMaxValueInArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
