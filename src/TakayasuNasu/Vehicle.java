package TakayasuNasu;

import java.util.Objects;

public abstract class Vehicle implements Steerable {

  private String productId;
  private Integer weight;

  public Vehicle(String productId, int weight) {
    this.productId = productId;
    this.setWeight(weight);
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    if (weight > -1) {
      this.weight = weight;
    }
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "productId='" + productId + '\'' +
        ", weight=" + weight +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return this.productId == vehicle.productId;
  }

}
