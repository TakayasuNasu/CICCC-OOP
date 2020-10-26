package minProject2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactList {

  ArrayList<Contact> list;

  public ContactList() {
  }

  public ContactList(ArrayList<Contact> list) {
    this.list = list;
  }

  public ArrayList<Contact> getList() {
    return list;
  }

  public void setList(ArrayList<Contact> list) {
    this.list = list;
  }

  public ArrayList<Contact> addList(Contact contact) {
    this.list.add(contact);
    return list;
  }

  public ArrayList<Contact> findByName(String name) {
    return (ArrayList<Contact>) this.list.stream().filter(contact -> contact.getName().equals(name))
        .collect(
            Collectors.toList());
  }

  public int autoIncrementID() {
    ArrayList<Contact> list = (ArrayList<Contact>) this.list.stream()
        .sorted((a, b) -> b.getId() - a.getId()).collect(Collectors.toList());
    if (list.size() > 0) {
      return list.get(0).getId() + 1;
    }
    return 1;
  }

  @Override
  public String toString() {
    return "ContactList{" +
        "list=" + list +
        '}';
  }
}
