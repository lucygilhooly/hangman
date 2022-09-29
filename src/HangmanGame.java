import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    int lives;
    int totalLives = 5;
    Scanner scanner = new Scanner(System.in);
    String unknownWord = hangmanUtil.unknownWord();
    ArrayList<Character> guesses = new ArrayList<>();
    ArrayList<Character> alreadyGuessed = new ArrayList<>();


    public void playGame() {

        boolean gameActive = true;

        lives = totalLives;

        System.out.println("Lets play Hangman!!!");
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome to my Hangman game " + name );
        System.out.println("Lets Begin!!");
        convertToUnderscores();
        System.out.println("your chosen word is : " + guesses + " & you have " + lives + " lives, use them wisely!!");
        System.out.println("take a guess");

        while (gameActive) {

            char guessAsChar = readUserGuess();
            String guess = "" + guessAsChar;
            if (unknownWord.contains(guess)) {
                System.out.println("well done " + guess + " is in the word! You have " + lives + " lives remaining!");
                System.out.println("take another guess!");
                for (int i = 0; i < unknownWord.length(); i++) {
                    char ch = unknownWord.charAt(i);
                    if (ch == guessAsChar) {
                        guesses.set(i, ch); // replace _ with guessed char
                    }
                }
                System.out.println(guesses);
            } else {
                lives = lives - 1;
                System.out.println("Hard luck! " + guess + " is not in the word!! You now have " + lives + " lives left, Guess again");
            }
            if (!guesses.contains('_')) {
                gameActive = false;
                System.out.println("Well Done! you've won!!");
            }
            if (!alreadyGuessed.contains(guessAsChar) && gameActive ) {
                alreadyGuessed.add(guessAsChar);
                System.out.println("The characters you have already guessed are: " + alreadyGuessed);
            }
            if (lives <= 0) {
                System.out.println("Looks like you've used all your lives. GAME OVER");
                gameActive = false;
            }
        }

    }

    void convertToUnderscores(){
        for (int i = 0; i < unknownWord.length(); i++) {
            guesses.add('_');
        }
    }
    Character readUserGuess() {
        while (true) {
            String guess = scanner.nextLine();
            if (guess.equals("") || guess.length() > 1) {
                System.out.println("Please enter a valid guess.");
            } else {
                return guess.toLowerCase().charAt(0);
            }
        }

    }

//    Character checkUserGuess() {
//            for (int i = 0; i < unknownWord.length(); i++) {
//                char ch = unknownWord.charAt(i);
//                if (ch == guessAsChar) {
//                    guesses.set(i, ch); // replace _ with guessed char
//                }
//                System.out.println(guesses);
//    }
//
//    }


    public static void main(String[] args) {

        HangmanGame hangmanGame = new HangmanGame();
        hangmanGame.playGame();

    }
}
// loop

// read user's guess

// if correct then

// display correct message

// replace _ in guesses with guessed letter

// else incorrect

// display incorrect message

// lose a life

// displayed guesses

// end if

// if run out of lives - then lost

// if guessed all letters then won!

// end loop

