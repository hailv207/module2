import java.util.Scanner;

public class CharacterAppearanceCounting {
    public static void main(String[] args) {
        String string = "Believe you can and you're halfway there.";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the character you want to check appearance:");
        char character = scanner.next().charAt(0);
        System.out.printf("The character '%s' appears %d times in the string '%s'.",character,countCharacterAppearance(character,string),string);
    }
    public static int countCharacterAppearance(char character, String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == character){
                count++;
            }
        }
        return count;
    }
}
