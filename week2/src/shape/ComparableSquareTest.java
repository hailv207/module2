package shape;

import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args) {
        ComparableSquare[] list = new ComparableSquare[3];
        list[0] = new ComparableSquare(6);
        list[1] = new ComparableSquare(5);
        list[2] = new ComparableSquare(4);
        System.out.println("Pre-Sort");
        for (Square sq : list){
            System.out.println(sq);
        }
        Arrays.sort(list);
        System.out.println("After-sort");
        for (Square sq : list){
            System.out.println(sq);
        }
    }
}
