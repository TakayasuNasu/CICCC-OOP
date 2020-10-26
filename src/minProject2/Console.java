package minProject2;

public class Console {

  boolean isRunning = false;

  void menu() {
    System.out.println("+===  Contact  App  ===+");
    System.out.println("| 1. List all Contacts |");
    System.out.println("| 2. Add new Contact   |");
    System.out.println("| 3. Remove Contact    |");
    System.out.println("| 4. Update Contact    |");
    System.out.println("| 5. Quit              |");
    System.out.println("+======================+");
  }

  void yourOption() {
    System.out.print("Enter your option: ");
  }

  public void enterName() {
    System.out.println("Enter name:");
  }

  public void errorEnterName() {
    System.out.println("Invalid enter name:");
  }

  public void enterMobile() {
    System.out.println("Enter mobile:");
  }

  public void enterWork() {
    System.out.println("Enter work:");
  }

  public void enterHome() {
    System.out.println("Enter home:");
  }

  public void errorEnterTel() {
    System.out.println("Invalid enter tel number:");
  }

  public void enterCity() {
    System.out.println("Enter city:");
  }

  public void addedContact() {
    System.out.println("Successfully added a new contact!");
  }

  public void removeContact() {
    System.out.println("Enter the index of the contact to remove:");
  }

  public void removed() {
    System.out.print("Successfully removed ");
  }

  public void updateContact() {
    System.out.println("Enter the index of the contact to update:");
  }

  public void updated() {
    System.out.println("Successfully update ");
  }

  public void errorNumber() {
    System.out.println("Invalid enter number:");
  }

  void run() {
    isRunning = true;
  }

  void quit(int number) {
    if (number == 5) {
      this.isRunning = false;
      System.out.println("Bye");
    }
  }

  void quit() {
    isRunning = false;
    System.out.println("Bye");
  }

  void again(boolean code) {
    if (code) {
      System.out.println("Invalid Input. Enter number between 1 and 5;");
    }
  }

  void shouldQuit(boolean code) {
    if (code) {
      isRunning = false;
      System.out.println("Oops! what's happen??");
    }
  }
}
