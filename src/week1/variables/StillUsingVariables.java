package week1.variables;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StillUsingVariables {
  public static void main(String[] args) {
    String name = "Takayasu Nasu";
    Date date   = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    System.out.println(String.format("My name is %s and I'll graduate in %s.", name, sdf.format(date)));
  }
}
