package minProject2.actions;

import minProject2.Console;
import minProject2.Contact;
import minProject2.ContactList;
import minProject2.InputCollector;
import minProject2.YmlStream;

public class UpdateContactAction implements Action {

  Console console;
  Contact contact;
  YmlStream yml;
  InputCollector ic;
  InputEnter inputEnter;

  public UpdateContactAction() {
    this.console = new Console();
    this.yml = new YmlStream();
    this.inputEnter = new InputEnter();
    this.ic = new InputCollector();

  }

  @Override
  public void run(ContactList cl) {
    for (int i = 0; i < cl.getList().size(); i++) {
      System.out.println(i + ". " + cl.getList().get(i));
    }

    boolean pass = false;
    while (!pass) {
      this.console.updateContact();
      int num = this.ic.removeNumber(cl.getList().size());
      if (num < 0) {
        this.console.errorNumber();
        break;
      }
      this.contact = this.inputEnter.getContact(cl);
      cl.getList().set(num, this.contact);
      this.console.updated();
      yml.write(cl);
      pass = true;
    }
  }
}
