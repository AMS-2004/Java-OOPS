import java.util.Scanner;

public class SortStringCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Bubble Sort Algorithm
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    // Swap characters
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }

        // Convert back to string
        String sortedString = new String(chars);

        // Print result
        System.out.println("Sorted string in ascending order: " + sortedString);

        sc.close();
    }
}

