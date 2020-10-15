package lab2;

public class Province {
  private String name;
  private String capital;
  private long population;

  public static final String[] provinceNames = {
          "British Columbia",
          "Alberta",
          "Saskatchewan",
          "Manitoba",
          "Ontario",
          "Quebec",
          "New Brunswick",
          "Nova Scotia",
          "Prince Edward Island",
          "Newfoundland, and Labrador"
  };

  public static final String[] cityNames = {
          "Victoria",
          "Edmonton",
          "Regina",
          "Winnipeg",
          "Toronto",
          "Ville de Québec",
          "Fredericton",
          "Halifax",
          "St. John's",
          "Charlottetown"
  };

  public static final long DEFAULT_POPULATION = 4648055;
  public static final String DEFAULT_PROVINCE = "British Columbia";
  public static final String DEFAULT_CAPITAL = "Victoria";

  public Province(String name, String capital, long population) {
    if (this.isValidAll(name, capital, population)) {
      this.name = name;
      this.capital = capital;
      this.population = population;
    } else {
      this.name = DEFAULT_PROVINCE;
      this.capital = DEFAULT_CAPITAL;
      this.population = DEFAULT_POPULATION;
    }
  }

  public Province() {
    this.name = DEFAULT_PROVINCE;
    this.capital = DEFAULT_CAPITAL;
    this.population = DEFAULT_POPULATION;
  }

  private boolean isValidProvince(String province) {
    for (String name: this.provinceNames) {
      if (name.equals(province)) return  true;
    }
    return false;
  }

  private boolean isValidCapitalCity(String capital) {
    for (String name: this.cityNames) {
      if (name.equals(capital)) return  true;
    }
    return false;
  }

  private boolean isValidPopulation(long population) {
    return population >= 30000 && population <= 15000000;
  }

  private boolean isValidAll(String province, String capital, long population) {
    if (!this.isValidProvince(province)) return false;
    if (!this.isValidCapitalCity(capital)) return false;
    if (!this.isValidPopulation(population)) return false;
    return true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  public String getDetails() {
    String strFormat = "The capital of %s (population. %d) is %s.";
    return String.format(strFormat, this.getName(), this.getPopulation(), this.getCapital());
  }
}
