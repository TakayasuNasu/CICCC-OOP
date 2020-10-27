package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

  public static void main(String[] args) {
    List<Piece> list = new ArrayList<>(Arrays.asList(
        new King(),
        new Queen(),
        new Rook(),
        new Bishop(),
        new Knight(),
        new Pawn()
    ));

    for (Piece p : list) {
      p.move();
    }

    Pawn p1 = new Pawn(true, true, new Queen());
    Pawn p2 = new Pawn(true, false, null);
    Pawn p3 = new Pawn(false, false, null);
    Pawn p4 = new Pawn(false, true, new Queen());
    Pawn p5 = new Pawn(true, true, new Knight());

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p4));
    System.out.println(p1.equals(p5));
    System.out.println(p2.equals(p3));
    System.out.println(p4.equals(p5));
  }
}
