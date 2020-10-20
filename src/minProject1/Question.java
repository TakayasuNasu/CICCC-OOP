package minProject1;

public class Question {

  public static final String[] CITY = {
      "Chongqing",
      "Shanghai",
      "Beijing",
      "Lagos",
      "Mumbai",
      "Dhaka",
      "Chengdu",
      "Karachi",
      "Guangzhou",
      "Istanbul",
      "Tokyo",
      "Tianjin",
      "Moscow",
      "Sao Paulo",
      "Kinshasa",
      "Delhi",
      "Baoding",
      "Lahore",
      "Wuhan",
      "Cairo",
      "Cairo",
      "Seoul",
      "Jakarta",
      "Wenzhou",
      "Lima",
      "Mexico City",
      "London",
      "Bangkok",
      "Xian",
      "Chennai",
      "Bangalore",
      "New York",
      "Ho Chi Minh City",
      "Hyderabad",
      "Shenzhen",
      "Suzhou",
      "Nanjing",
      "Dongguan",
      "Tehran"
  };

  private String correct;
  private String current;

  public Question() {
    this.current = this.correct = CITY[(int) (Math.random() * ((CITY.length)))];
  }

  public String getCorrect() {
    return correct;
  }

  public String getCurrent() {
    return current;
  }

  void replaceLetter(int index) {
    StringBuilder replaced = new StringBuilder(this.current);
    replaced.setCharAt(index, '*');
    this.current = replaced.toString();
  }

}
