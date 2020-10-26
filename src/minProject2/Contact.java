package minProject2;

public class Contact {

  private int id;
  private String name;
  private String mobile;
  private String work;
  private String home;
  private String city;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  boolean hasParams() {
    return this.mobile != null
        || this.work != null
        || this.home != null
        || this.city != null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("<" + this.name + ">");
    if (this.hasParams()) {
      sb.append(" ( ");
    }
    if (!this.mobile.equals("")) {
      sb.append("mobile=").append(this.mobile);
    }
    if (!this.work.equals("")) {
      sb.append(" work=").append(this.work);
    }
    if (!this.home.equals("")) {
      sb.append(" home=").append(this.home);
    }
    if (!this.city.equals("")) {
      sb.append(" city=").append(this.city);
    }
    if (this.hasParams()) {
      sb.append(" )");
    }
    return sb.toString();
  }
}
