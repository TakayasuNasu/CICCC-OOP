package lab3;

public class Rook extends Piece {

  public Rook() {
    this.value = 5;
  }

  @Override
  void move() {
    System.out.println("One squar");
  }

  @Override
  public String toString() {
    return String.format("Rook{value='%d'}", this.value);
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
