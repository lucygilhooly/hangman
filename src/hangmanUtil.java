import java.util.ArrayList;
import java.util.Random;

public class hangmanUtil {

    private static final Random RANDOM = new Random();
    int randomIndex = RANDOM.nextInt(words.size());
    public static ArrayList<String> words = new ArrayList<String>();

    static{
        words.add("mug");
        words.add("glass");
        words.add("knife");
        words.add("fork");
        words.add("spoon");
        words.add("spatula");
    }


    //add a method which will randomly choose a word
    public static String unknownWord() {
        return words.get( RANDOM.nextInt( words.size()));
    }

    // method which will convert selected word to -----
    public static String secretWord(String unknownWord) {
        String underscores = "";
        for (int i = 0; i < unknownWord.length(); i++) {
            underscores += ("_");
        }
        System.out.println(unknownWord);
        return underscores;
    }




}
