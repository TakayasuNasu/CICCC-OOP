package minProject2;

import minProject2.actions.Action;
import minProject2.actions.AddContactAction;
import minProject2.actions.RemoveContactAction;
import minProject2.actions.ShowListAction;
import minProject2.actions.UpdateContactAction;

public class ContactController {

  ContactList cList;
  Console console;
  InputCollector ic;
  Validation valid;
  Action action;
  YmlStream yml;

  public ContactController() {
    this.yml = new YmlStream();
    this.cList = new ContactList(yml.read());
    this.console = new Console();
    this.ic = new InputCollector();
    this.valid = new Validation();
  }

  void start() {
    this.console.run();
    this.console.menu();
    while (this.console.isRunning) {
      this.console.yourOption();
      int code = ic.optionNumber();
      this.console.again(valid.run().error(code).result());
      if (valid.run().error(code).result()) {
        continue;
      }
      this.doNext(code);
    }
  }

  void doNext(int code) {
    switch (code) {
      case 1 -> action = new ShowListAction();
      case 2 -> action = new AddContactAction();
      case 3 -> action = new RemoveContactAction();
      case 4 -> action = new UpdateContactAction();
      case 5 -> {
        this.console.quit(code);
        return;
      }
    }
    action.run(this.cList);
  }
}
