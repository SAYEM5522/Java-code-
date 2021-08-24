package Assignment3;

import java.util.Arrays;

// Contact Class 

class Contact {
  private String name;
  private String phoneno;
  private boolean emergency;

  public Contact(String name, String phoneno, boolean emergency) {
    this.name = name;
    this.phoneno = phoneno;
    this.emergency = emergency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneno() {
    return phoneno;
  }

  public void setPhoneno(String phoneno) {
    this.phoneno = phoneno;
  }

  public boolean isEmergency() {
    return emergency;
  }

  public void setEmergency(boolean emergency) {
    this.emergency = emergency;
  }

  public void copy(Contact c) {
    System.out.println(c);
  }

  @Override
  public String toString() {
    return "Contact [name= " + name + " Phone number= " + phoneno + " Emergency= " + emergency + " ]";
  }

}

// PhoneBook Class
class Phonebook {
  private int size;
  int n = 0;
  private Contact[] contact = new Contact[3];

  public Phonebook(int size) {
    this.size = size;
  }

  public Contact[] getContact() {
    return contact;
  }

  public void setContact(Contact[] contact) {
    this.contact = contact;

  }

  public int getSize() {
    return size;
  }

  public int getIndex(String name) {
    return 0;
  }

  boolean t;

  public boolean AddContact(Contact c) {

    contact[n++] = c;

    if (size > getContact().length) {

      t = true;
    } else {
      t = false;
    }
    return t;
  }

  public void viewAllContacts() {
    System.out.println();
    System.out.println("ALL the contact :");

    for (int i = 0; i < getContact().length; i++) {
      System.out.println(contact[i]);
    }
    System.out.println();
  }

  public void viewEmergencyContacts() {
    for (int i = 0; i < getContact().length; i++) {
      if (contact[i].isEmergency() == true) {
        System.out.println("Emergency Contact = " + contact[i]);

      }
    }
  }

  int i = 0;

  public String viewContact(String name) {
    for (int i = 0; i < getContact().length; i++) {
      if (contact[i].getName().equals(name)) {
        System.out.println("Match Contact= " + contact[i]);

      }
    }

    return "";

  }

  public boolean check;

  public boolean delectContact(String name) {
    for (int i = 0; i < getContact().length; i++) {
      if (contact[i].getName().equals(name)) {
        for (int j = i; j < getContact().length - 1; j++) {
          contact[j] = contact[j + 1];
          check = true;
          n = contact[j].getName().toCharArray().length;

        }

      }
    }
    return check;

  }

  public boolean delectContact(int index) {

    String[] copy = new String[getContact().length - 1];
    for (int i = 0, j = 0; i < n; i++) {
      if (i != index) {
        copy[j++] = contact[i].getName();
        check = true;
      } else {
        check = false;
      }
    }
    return check;

  }

  public void delectAll() {

    contact = null;
    System.out.println("Delete all the contact from the contacts list = " + contact);

  }

  public boolean isEmpty() {
    if (contact == null) {
      check = true;
    } else {
      check = false;
    }
    return check;
  }

  public boolean isFull() {
    if (contact == null) {
      check = false;
    }
    return check;
  }

  @Override
  public String toString() {
    return "Phonebook [contact=" + Arrays.toString(contact) + ", size=" + size + "]";
  }

}

// Main Class
public class PhonebookDemo {
  public static void main(String[] args) {
    Phonebook pb = new Phonebook(5);

    Contact con = new Contact("zarif", "01621796745", true);
    Contact con1 = new Contact("sayem", "01628217722", true);
    Contact con2 = new Contact("md", "01400227578", false);
    System.out.println("There is space in the contact list = " + pb.AddContact(con));
    pb.AddContact(con1);
    pb.AddContact(con2);
    pb.viewAllContacts();
    pb.viewContact("sayem");

    System.out.println("Delete contact By name= " + pb.delectContact("sssss"));
    System.out.println("Delete contact By name= " + pb.delectContact("sayem"));
    Contact con3 = new Contact("sss", "01811431042", true);

    pb.AddContact(con3);
    pb.viewAllContacts();

    pb.viewEmergencyContacts();
    System.out.println("Delete contact By index= " + pb.delectContact(1));
    pb.delectAll();
    System.out.println("Contact list is empty= " + pb.isEmpty());
    System.out.println("Contact list is Full= " + pb.isFull());
  }
}
