package minProject2.actions;

import minProject2.ContactList;

public class ShowListAction implements Action {

  @Override
  public void run(ContactList cl) {
    for (int i = 0; i < cl.getList().size(); i++) {
      System.out.println(i + ". " + cl.getList().get(i));
    }
  }
}
