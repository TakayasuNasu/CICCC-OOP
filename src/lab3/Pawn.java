package lab3;

public class Pawn extends Piece {

  boolean promoted;
  Piece newPiece;

  public Pawn() {
  }

  public Pawn(boolean isWhite, boolean promoted, Piece newPiece) {
    super(1, isWhite);
    this.promoted = promoted;
    this.promote(newPiece);
  }

  public void promote(Piece newPiece) {
    if (this.promoted) {
      this.newPiece = newPiece;
      this.value = newPiece.value;
    }
  }

  @Override
  void move() {
    System.out.println("Forward 1");
  }

  @Override
  public String toString() {
    return String.format("Pawn{value='%d'}", this.value);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Pawn)) {
      return false;
    }
    Pawn p = (Pawn) obj;
    if (p.isWhite != this.isWhite) {
      return false;
    }
    if (p.value != this.value) {
      return false;
    }
    if (p.promoted != this.promoted) {
      return false;
    }
    return true;
  }
}
