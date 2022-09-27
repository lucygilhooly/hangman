import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lets play Hangman!!!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        String unknownWord = hangmanUtil.unknownWord();
        ArrayList <Character> guesses = new ArrayList<>();
        for (int i = 0; i < unknownWord.length(); i++) {
           guesses.add('_');
        }
        System.out.println(guesses);

        System.out.println("Great! Welcome to hangman " + name + " Lets Begin!!");
        System.out.println("your chosen word is : " + hangmanUtil.secretWord(unknownWord));


        System.out.println("take your first guess");
        String guess = scanner.next();
        if (unknownWord.contains(guess)){
            System.out.println("well done " + guess + " is in the word");
            for( int i = 0; i < unknownWord.length(); i++ ) {
                char ch = un
            }
        }else {
            System.out.println("Hard luck! " + guess + " is not in the word!! Guess again");
        }





        //want the guessed letter to replace the relevant underscore and display what we have of the word so far

        //possibly:
        // while loop to repeat, enter guess sout "keep guessing!" & remaining livesl







    }
}