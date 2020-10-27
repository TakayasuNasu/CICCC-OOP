package lab3;

public class Knight extends Piece {

  public Knight() {
    this.value = 2;
  }

  @Override
  void move() {
    System.out.println("Like an L");
  }

  @Override
  public String toString() {
    return String.format("Knight{value='%d'}", this.value);
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
