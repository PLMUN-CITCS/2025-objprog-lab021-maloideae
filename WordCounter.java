import java.util.Scanner;

public class WordCounter {

    public static String getSentenceInput(Scanner input) {
        System.out.print("Enter a sentence: ");
        input.nextLine();
        return input.nextLine();
    }

    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = getSentenceInput(input);
        int wordCount = countWords(sentence);
        System.out.println("Word count: " + wordCount);

        input.close();
    }
}
