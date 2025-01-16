import java.util.Scanner;

public class WordReplacer {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use the replaceAll method to replace the old word with the new word
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Input the word to be replaced and the new word
        System.out.println("Enter the word to be replaced:");
        String oldWord = scanner.nextLine();

        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();

        // Replace the word and display the result
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence: " + updatedSentence);

        scanner.close();
    }
}