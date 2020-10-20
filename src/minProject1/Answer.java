package minProject1;

import java.util.Scanner;

public class Answer {

  private String current = "";

  public Answer(int num) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < num; i++) {
      answer.append("_");
    }
    this.current = answer.toString();
  }

  public String getCurrent() {
    return current;
  }

  public void setCurrent(String current) {
    this.current = current;
  }

  char call() {
    System.out.print("Guess a letter: ");
    Scanner scan = new Scanner(System.in);
    return scan.next().charAt(0);
  }

  Boolean more() {
    return this.current.contains("_");
  }

  int doAnswer(char answer, String question) {
    return question.indexOf(answer);
  }

  boolean isCorrect(int answerCode) {
    return answerCode > -1;
  }

  // 正解の一文字を取得
  char getOneLetter(int index, String question) {
    return question.charAt(index);
  }

  void replaceLetter(int index, char ch) {
    StringBuilder replaced = new StringBuilder(this.current);
    replaced.setCharAt(index, ch);
    this.current = replaced.toString();
  }
}
