package minProject1;

import java.util.ArrayList;
import java.util.List;

public class Game {

  private Question question;
  private Answer answer;
  private int wrongCount = 0;
  private List<String> wrongLetters = new ArrayList<>();

  public Game() {
    this.question = new Question();
    this.answer = new Answer(this.question.getCorrect().length());
  }

  public Game(Question question, Answer answer) {
    this.question = question;
    this.answer = answer;
  }

  void init() {
    System.out.println("Hear's a question.");
    System.out.println(this.answer.getCurrent());
  }

  void start() {
    this.init();
    while (this.still()) {
      char letter = this.answer.call();
      if (String.valueOf(letter).length() < 1) {
        continue;
      }
      int answerCode = answer.doAnswer(letter, this.question.getCurrent());
      if (answer.isCorrect(answerCode)) {
        char ch = answer.getOneLetter(answerCode, this.question.getCorrect());
        this.answer.replaceLetter(answerCode, ch);
        this.question.replaceLetter(answerCode);
      } else {
        this.wrongCount++;
        this.wrongLetters.add(String.valueOf(letter));
      }
      this.showResult();
      if (this.wrongCount > 9) {
        this.lost();
        break;
      }
    }
    this.win();
  }

  private Boolean still() {
    return this.answer.more();
  }

  private void showResult() {
    System.out.println("You are guessing: " + this.answer.getCurrent());
    String[] array = this.wrongLetters.toArray(new String[0]);
    String message = String.join(" ", array);
    System.out.println(
        String.format("You have guessed (%d) wrong letters: %s ", this.wrongCount, message));
  }

  private void win() {
    System.out.println("You win!");
    System.out
        .println(String.format("You have guessed '%s' correctly.", this.question.getCorrect()));
  }

  private void lost() {
    System.out.println("You lose!");
    System.out.println(String.format("The correct word was '%s':", this.question.getCorrect()));
  }
}
