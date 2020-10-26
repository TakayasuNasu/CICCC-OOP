package minProject2;

public class MyTest {

  public static void main(String[] args) {
    InputCollector ic = new InputCollector();
    Validation valid = new Validation();
    YmlStream yml = new YmlStream();
    ContactList cl = new ContactList(yml.read());

    String s1 = "Takayasu";
    String s2 = "Takayasu Nasu";
    String s3 = "Taka1";

    System.out.println(valid.run().name(s1).result());
    System.out.println(valid.run().name(s2).result());
    System.out.println(valid.run().name(s3).result());
    System.out.println();

    System.out.println(cl.findByName("Takayasu"));
    System.out.println(cl.findByName("Deric").size() == 0);
    System.out.println();

    String tel1 = "604-376-2691";
    String tel2 = "6043762691";
    String tel3 = "09029660823";
    String tel4 = "12345";
    String tel5 = "123456789012";

    System.out.println(valid.run().tel(tel1).result());
    System.out.println(valid.run().tel(tel2).result());
    System.out.println(valid.run().tel(tel3).result());
    System.out.println(valid.run().tel(tel4).result());
    System.out.println(valid.run().tel(tel5).result());
    System.out.println();

    System.out.println(cl.autoIncrementID());
    System.out.println();

//    yml.write(cl)

  }
}
