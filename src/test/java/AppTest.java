import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    App app = new App();
    Integer score = 1;
    assertEquals(score, app.scrabbleScore("a"));
  }
  @Test
  public void scrabbleScore_returnIndexOfUserInputInScrabbleLetterArray_1() {
    App app = new App();
    Integer index = 1;
    assertEquals(index, app.scrabbleScore("a"));
  }
  @Test
  public void scrabbleScore_returnsAScrabbleScoreForMultipleLetters_3() {
    App app = new App();
    Integer score = 3;
    assertEquals(score, app.scrabbleScore("aaa"));
  }


}



  // @Test
  // public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
  //   App app = new App();
  //   Integer score = 1;
  //   assertEquals(score, app.scrabbleScore("a"));
// }
//
// }
