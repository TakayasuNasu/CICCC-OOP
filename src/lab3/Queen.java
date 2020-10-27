package lab3;

public class Queen extends Piece {

  public Queen() {
    this.value = 9;
  }

  @Override
  void move() {
    System.out.println("Like bishop and rook");
  }

  @Override
  public String toString() {
    return String.format("Queen{value='%d'}", this.value);
  }

  @Override
  public boolean equals(Object obj) {
    Piece p = (Piece) obj;
    if (p.isWhite == this.isWhite
        && p.value == this.value) {
      return true;
    }
    return false;
  }
}
