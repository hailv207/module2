public class GreatestValueIn2dArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        for (int i = 0;i < array.length;i++){
            DeleteValueFromArray.displayIntArray(array[i]);
        }
        System.out.println("The greatest value in Array is: " + findMaxValueIn2dIntArray(array));
    }

    public static int findMaxValueIn2dIntArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
