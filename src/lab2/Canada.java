package lab2;

public class Canada {
  private Province[] provinces;

  public Canada(Province[] provinces) {
    this.provinces = provinces;
  }

  public void displayAllProvinces() {
    for (Province p: this.provinces) System.out.println(p.getDetails());;
  }

  public int getNumOfProvincesBetween(int min, int max) {
    int count = 0;
    for (Province p: this.provinces) {
      if (p.getPopulation() > min * 1000000 && p.getPopulation() < max * 1000000) count ++;
    }
    return count;
  }
}
