import sun.jvm.hotspot.runtime.bsd_amd64.BsdAMD64JavaThreadPDAccess;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8};
        int[] array3 = {9, 10};
        int[] concatenatedArray = concatenateIntArrays(array1,array2,array3);
        DeleteValueFromArray.displayIntArray(concatenatedArray);
    }

    public static int[] concatenateIntArrays(int[]... args) {
        int sumLength = 0;
        for (int i = 0; i < args.length; i++) {
            sumLength += args[i].length;
        }
        int[] resultArray = new int[sumLength];
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                resultArray[index] = args[i][j];
                index++;
            }
        }
        return resultArray;
    }
}
