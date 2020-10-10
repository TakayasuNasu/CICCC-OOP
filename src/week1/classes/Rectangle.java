package week1.classes;

public class Rectangle {

  private int width;
  private  int height;
  private String color;

  public Rectangle() {
    this.width  = 1;
    this.height = 1;
    this.color  = "Blue";
  }

  public Rectangle(int width, int height, String color) {
    this.setWidth(width);
    this.setHeight(height);
    this.setColor(color);
  }

  public void setWidth(int width) {
    if (width < 1) {
      System.out.println("Could not change width...");
      return;
    }
    this.width = width;
  }

  public void setHeight(int height) {
    if (height < 1) {
      System.out.println("Could not change height...");
      return;
    }
    this.height = height;
  }

  public void setColor(String color) {
    if (color.length() < 3 || color.length() > 20) {
      System.out.println("Could not change color...");
      return;
    }
    if (!Character.isUpperCase(color.charAt(0))) {
      System.out.println("Could not change color...");
      return;
    }
    this.color = color;
  }

  public void draw() {
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.width; j++) {
        char w = this.color.charAt(0);
        System.out.print(w);
      }
      System.out.println();
    }
  }
}
