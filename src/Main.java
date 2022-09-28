import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// what happens with uppercase
        //what happens if they enter more than one character
        //splitting up into methods -


        int totalLives = 5;
        int lives;
        Boolean gameActive = true;

        lives = totalLives;

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
        ArrayList <Character> alreadyGuessed = new ArrayList<>();

        System.out.println("Great! Welcome to hangman " + name + " Lets Begin!!");
        System.out.println("your chosen word is : " + hangmanUtil.secretWord(unknownWord) + "you have " + lives + " lives, use them wisely!!");

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

        while (gameActive) {
            System.out.println("take a guess");

            String guess = scanner.next();
            char guessAsChar = guess.charAt(0);
            if (unknownWord.contains(guess)) {
                System.out.println("well done " + guess + " is in the word");
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
            if (!guesses.contains('_')){
                gameActive = false;
                System.out.println("Well Done! you've won!!");
            }
            if(!alreadyGuessed.contains(guessAsChar)){
                alreadyGuessed.add(guessAsChar);
                System.out.println("The characters you have already guessed are: " + alreadyGuessed);
            }
            if (lives <= 0){
                System.out.println("Looks like you've used all your lives. GAME OVER");
                gameActive = false;
            }
        }

//            if (guesses.contains(unknownWord)){
//                gameActive = false;
//            }

        }

    }
