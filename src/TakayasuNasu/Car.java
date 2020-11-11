package TakayasuNasu;

public class Car extends Vehicle {

  boolean isLeftHandDriving;

  public Car(String productId, Integer weight, boolean isLeftHandDrivin) {
    super(productId, weight);
    this.isLeftHandDriving = isLeftHandDrivin;
  }

  public boolean isLeftHandDriving() {
    return isLeftHandDriving;
  }

  public void setLeftHandDriving(boolean leftHandDriving) {
    isLeftHandDriving = leftHandDriving;
  }

  @Override
  public void accelerate() {
    if ((Integer) this.getWeight() == null) {
      System.out.println("there’s something wrong");
    } else {
      System.out.println("fire pistons, turn wheels");
    }
  }

  @Override
  public void steerLeft() {
    System.out.println("turn wheels left");
  }

  @Override
  public void steerRight() {
    System.out.println("turn wheels left");
  }

  @Override
  public String toString() {
    return "Car{" +
        "productId='" + this.getProductId() + '\'' +
        ", weight=" + this.getWeight() + '\'' +
        ", isLeftHandDriving=" + this.isLeftHandDriving() +
        '}';
  }
}
