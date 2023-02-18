/**
 * This service class is intended to contain the basic logic for playing the number guessing game.
 * Separating menu logic and game logic is good for two reasons: it makes both classes as simple
 * as they could be, and it also makes this class capable of being tested with automated tests, since testing
 * a class that receives user input is difficult. If the logic of the game were to become more complicated,
 * the advantages of separating code in this way will become immediately apparent. You will see this in the
 * coming mini-projects.
 */
public class GameService {

    public double secretNumber;

    public GameService(){
        secretNumber = 3.14;
    }
    /**
     * @param guessNumber the number that the user has input into their console.
     * @return true if guessNumber is equal to the secretNumber, false otherwise.
     */
    public boolean checkGuess(double guessNumber) {
        if(guessNumber == secretNumber){
            return true;
        } else {
        return false;
        }
    }
}