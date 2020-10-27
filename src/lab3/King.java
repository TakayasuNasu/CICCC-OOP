package lab3;

public class King extends Piece {

  public King() {
    this.value = 1000;
  }

  @Override
  void move() {
    System.out.println("One square");
  }

  @Override
  public String toString() {
    return String.format("King{value='%d'}", this.value);
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
