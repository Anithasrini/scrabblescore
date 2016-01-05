import static spark.Spark.*;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {}

    public Integer scrabbleScore(String userInput) {

      String[] scrabbleLetters = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
      Integer[] scrabbleValues = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
      Integer scrabbleScore = 0;

      for ( Integer i = 0; i < userInput.length(); i++ ) {
        char[] scrabbleCharArray = userInput.toCharArray();
        char result = scrabbleCharArray[i];
        String convertedChar = Character.toString(result);
        Integer letterIndex = Arrays.asList(scrabbleLetters).indexOf(convertedChar);
        Integer letterValue = scrabbleValues[letterIndex];
        scrabbleScore += letterValue;
      }
      return scrabbleScore;
      }
    }
