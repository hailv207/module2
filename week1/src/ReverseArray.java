public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("The original array:");
        displayIntArray(array);
        reverseIntArray(array);
        System.out.println("The array after reversing:");
        displayIntArray(array);

    }

    public static void reverseIntArray(int[] array) {

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public static void displayIntArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
