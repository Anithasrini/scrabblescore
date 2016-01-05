import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

    public String scrabbleScore(String userInput) {
        for ( Integer i = 0; i < userInput.length(); i++ ) {
          char[] scrabbleCharArray = userInput.toCharArray();
          char result = scrabbleCharArray[i];
          String convertedChar = Character.toString(result);
          return convertedChar;
        }
        return "That is not a valid word.";
        }
    }
    // String[] scrabbleLetters = {A};
    // Integer[] scrabbleValues = {1};
