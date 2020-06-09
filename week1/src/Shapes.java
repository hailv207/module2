import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Please enter your choice:");
            System.out.println("1. Draw Rectangle.");
            System.out.println("2. Draw Square Triangle.");
            System.out.println("3. Draw Isosceles Triangle.");
            System.out.println("4. Exit.");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            runChoice(choice);
        } while (choice != 4);
    }

    public static void runChoice(int choice) {
        switch (choice) {
            case 1:
                drawRectangle();
                break;
            case 2:
                drawTriangle();
                break;
            case 3:
                drawIsoscelesTriangle();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static void drawTriangle() {
        System.out.println("Please enter the position of square corner:");
        System.out.println("1. top-left");
        System.out.println("2. bottom-left");
        System.out.println("3. top-right");
        System.out.println("4. bottom-right");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        switch (position) {
            case 1:
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < 5; j++) {
                        if (j < 5 - i) {
                            System.out.print(" ");
                        }
                        if (j >= 5 - i) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j < 5 - i) {
                            System.out.print(" ");
                        }
                        if (j >= 5 - i) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;

        }
    }

    public static void drawRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Width:");
        int width = scanner.nextInt();
        System.out.println("Please enter the Height:");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void drawIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the height of Isosceles Triangle:");
        int height = scanner.nextInt();
        int length = 1;
       for (int i = 0; i < height; i++){
           for (int j = 0; j < (height - i) + length;j++){
               if (j >= (height -i)){
                   System.out.print("*");
               }else {
                   System.out.print(" ");
               }
           }
           length += 2;
           System.out.println("");
       }
    }
}
