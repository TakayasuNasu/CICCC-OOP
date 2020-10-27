package lab3;

public class Bishop extends Piece {

  public Bishop() {
    this.value = 3;
  }

  @Override
  void move() {
    System.out.println("Diagonally");
  }

  @Override
  public String toString() {
    return String.format("Bishop{value='%d'}", this.value);
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
