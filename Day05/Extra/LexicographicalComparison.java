import java.util.Scanner;

public class LexicographicalComparison {

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; // Return the difference between the first non-matching characters
            }
        }

        // If all characters match, compare lengths
        return length1 - length2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings from the user
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        // Compare the strings lexicographically
        int result = compareStrings(string1, string2);

        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" in lexicographical order.");
        }

        scanner.close();
    }
}

