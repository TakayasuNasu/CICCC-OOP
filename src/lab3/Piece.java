package lab3;

public abstract class Piece {

  int value;
  boolean isWhite;

  public Piece() {
    this.value = 1;
    this.isWhite = true;
  }

  public Piece(int value, boolean isWhite) {
    this.value = value;
    this.isWhite = isWhite;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  abstract void move();

  @Override
  public String toString() {
    return "Piece";
  }

}
