import java.util.Scanner;

public class LongestWordFinder {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Find and display the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);

        scanner.close();
    }
}
