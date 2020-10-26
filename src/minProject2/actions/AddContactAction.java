package minProject2.actions;

import minProject2.Console;
import minProject2.Contact;
import minProject2.ContactList;
import minProject2.YmlStream;

public class AddContactAction implements Action {

  Console console;
  Contact contact;
  YmlStream yml;
  InputEnter inputEnter;

  public AddContactAction() {
    this.console = new Console();
    this.yml = new YmlStream();
    this.inputEnter = new InputEnter();
  }


  @Override
  public void run(ContactList cl) {
    this.contact = this.inputEnter.getContact(cl);
    this.contact.setId(cl.autoIncrementID());
    cl.addList(this.contact);
    yml.write(cl);
    this.console.addedContact();
  }
}
