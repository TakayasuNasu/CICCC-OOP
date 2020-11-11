package myCorrection;

public class Driver {

  public static void main(String[] args) {
    MyArrayList ma = new MyArrayList();
    ma.add("hoge");
    ma.add("fuga");
    ma.stream().forEach(data -> System.out.println(data));

    MyLinkedList<String> ml = new MyLinkedList<>();
    ml.add(0, "Hoge");
    ml.add(1, "Piyo");
    System.out.println(ml);
  }
}
