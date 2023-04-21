import java.util.ArrayList;
import java.util.Random;

public class RandomPoemGenerator {
    private static final int NUM_LINES = 4;
    private static final int MAX_LINE_LENGTH = 8;
    private static final String[] WORD_BANK = {"rose", "thorn", "sky", "sea", "bird", "song"};

    public static void main(String[] args) {
        ArrayList<String> poem = generatePoem();
        for (String line : poem) {
            System.out.println(line);
        }
    }

    private static ArrayList<String> generatePoem() {
        ArrayList<String> poem = new ArrayList<>();
        Random random = new Random();

        // Generate each line of the poem
        for (int i = 0; i < NUM_LINES; i++) {
            String line = "";
            int lineLength = random.nextInt(MAX_LINE_LENGTH) + 1; // Length between 1 and MAX_LINE_LENGTH
            for (int j = 0; j < lineLength; j++) {
                int wordIndex = random.nextInt(WORD_BANK.length);
                String word = WORD_BANK[wordIndex];
                line += word + " ";
            }
            poem.add(line);
        }

        return poem;
    }
}


