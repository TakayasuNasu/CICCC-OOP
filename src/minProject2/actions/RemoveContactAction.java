package minProject2.actions;

import minProject2.Console;
import minProject2.ContactList;
import minProject2.InputCollector;
import minProject2.Validation;
import minProject2.YmlStream;

public class RemoveContactAction implements Action {

  Console console;
  InputCollector ic;
  Validation valid;
  YmlStream yml;

  public RemoveContactAction() {
    this.console = new Console();
    this.ic = new InputCollector();
    this.valid = new Validation();
    this.yml = new YmlStream();
  }

  @Override
  public void run(ContactList cl) {
    for (int i = 0; i < cl.getList().size(); i++) {
      System.out.println(i + ". " + cl.getList().get(i));
    }

    boolean pass = false;
    while (!pass) {
      this.console.removeContact();
      int num = this.ic.removeNumber(cl.getList().size());
      if (num < 0) {
        this.console.errorNumber();
        break;
      }
      String name = cl.getList().get(num).getName();
      cl.getList().remove(num);
      this.console.removed();
      System.out.println(name);
      yml.write(cl);
      pass = true;
    }
  }
}
