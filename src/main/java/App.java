import static spark.Spark.*;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {}

    public Integer scrabbleScore(String userInput) {
      userInput = userInput.replaceAll("//s+","");
      userInput = userInput.toUpperCase();

      String[] scrabbleLetters = {"A", "E", "I", "O", "U", "L", "N", "R", "S",
                                  "T", "D", "G", "B", "C", "M", "P", "F", "H",
                                  "V", "W", "Y", "K", "J", "X", "Q", "Z"};
      Integer[] scrabbleValues = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3,
                                  3, 4, 4, 4, 4, 4, 5, 8, 8, 10, 10};
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
