package minProject2.actions;

import minProject2.Console;
import minProject2.Contact;
import minProject2.ContactList;
import minProject2.InputCollector;
import minProject2.Validation;

public class InputEnter {

  private Contact contact;
  private Console console;
  private InputCollector ic;
  boolean pass;

  public InputEnter() {
    this.console = new Console();
    this.ic = new InputCollector();
    this.contact = new Contact();
    this.pass = false;
  }

  public Contact getContact(ContactList cl) {
    this.enterName(cl);
    this.pass = false;
    this.enterMobile();
    this.pass = false;
    this.enterWork();
    this.pass = false;
    this.enterHome();
    this.enterCity();
    return contact;
  }

  private void enterName(ContactList cl) {
    while (!this.pass) {
      this.console.enterName();
      String name = this.ic.name(cl);
      if (!name.equals("error")) {
        this.contact.setName(name);
        this.pass = true;
      } else {
        console.errorEnterName();
      }
    }
  }

  private void enterMobile() {
    while (!this.pass) {
      this.console.enterMobile();
      String tel = this.ic.tel();
      if (!tel.equals("error")) {
        this.contact.setMobile(tel);
        this.pass = true;
      } else {
        console.errorEnterTel();
      }
    }
  }

  private void enterWork() {
    while (!this.pass) {
      this.console.enterWork();
      String tel = this.ic.tel();
      if (!tel.equals("error")) {
        this.contact.setWork(tel);
        this.pass = true;
      } else {
        console.errorEnterTel();
      }
    }
  }

  private void enterHome() {
    while (!this.pass) {
      this.console.enterHome();
      String tel = this.ic.tel();
      if (tel.equals("skip")) {
        break;
      }
      if (!tel.equals("error")) {
        this.contact.setHome(tel);
        this.pass = true;
      } else {
        console.errorEnterTel();
      }
    }
  }

  private void enterCity() {
    this.console.enterCity();
    String city = this.ic.city();
    if (!city.equals("skip")) {
      this.contact.setCity(city);
    }
  }
}
