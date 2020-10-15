package lab2;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {
    Canada canada = new Canada(createProvinces());
    canada.displayAllProvinces();
    System.out.println(canada.getNumOfProvincesBetween(1, 15));
  }

  private static Province[] createProvinces() {
    List<Province> provinceList = new ArrayList<Province>();
    Province iterator = new Province();
    for (int i = 0; i < Province.provinceNames.length; i++) {
      int randomPopulation = (int)(Math.random() * ((15000000 - 30000) + 1));
      Province p = new Province(iterator.provinceNames[i], iterator.cityNames[i], randomPopulation);
      provinceList.add(p);
    }
    return provinceList.toArray(new Province[provinceList.size()]);
  }
}
