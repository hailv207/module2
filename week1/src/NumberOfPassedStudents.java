import java.util.Scanner;

public class NumberOfPassedStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Please enter the number of students:");
            size = scanner.nextInt();
        }while (size < 1 || size > 30);
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            do {
                System.out.printf("Please enter the point of student %d:", i);
                list[i] = scanner.nextInt();
            } while (list[i] < 0 || list[i] > 10);
        }
        int standardValue;
        do {
            System.out.println("Please enter the minimum points to pass the exam:");
            standardValue= scanner.nextInt();
        }while (standardValue < 0 || standardValue > 10);
        System.out.printf("There are %d students passed the exam.", countPassed(list, standardValue));
    }

    public static int countPassed(int[] list, int standardValue) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= standardValue) {
                count++;
            }
        }
        return count;
    }
}
