package TakayasuNasu;

import java.util.ArrayList;

public class Driver {

  static ArrayList<Vehicle> vehicles;

  public static void main(String[] args) {
    vehicles = new ArrayList<>();
    vehicles.add(new Car("c1", 250, true));
    vehicles.add(new Car("c2", 220, true));
    vehicles.add(new Car("c3", -210, false));
    vehicles.add(new Boat("b1", 500));
    vehicles.add(new Boat("b2", 700));
    vehicles.add(new Boat("b3", 800));

    for (Vehicle v : vehicles) {
      System.out.println(v.toString());
    }

    System.out.println();

    for (Vehicle v : vehicles) {
      v.accelerate();
    }
  }
}
