package lab1;

public class Driver {
  public static void main(String[] args) {
    Model model = new Model("Susan", "Smith", 50, 100);
    String shortName = "ab";
    model.setFirstName(shortName);
    model.setLastName(shortName);
    String longName = "a".repeat(21);
    model.setFirstName(longName);
    model.setLastName(longName);

    model.setHeight(23);
    model.setHeight(85);

    model.setWeight(79.0);
    model.setWeight(281.0);

    System.out.println(model.getHeightInFeetAndInches());

    System.out.println();

    model.printDetails();

    System.out.println();

    model.displayModelDetails();

    System.out.println();

    model.setFirstName("Tiger");
    model.setLastName("Woods");
    model.setHeight(70);
    model.setSmokes(true);
    model.displayModelDetails();

  }
}
