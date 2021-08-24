package hwAssignment3;

class Contact {
  private String name;
  private String phoneno;
  private boolean emergency;

  public Contact() {

  }

  public Contact(String name, String phoneno, boolean emergency) {
    this.name = name;
    this.phoneno = phoneno;
    this.emergency = emergency;

  }

  public boolean isEmergency() {
    return emergency;
    /*
     * if(emergency==true){ return true; } else return false;
     */
  }

  public String getName() {
    return name;
  }

  public String getPhoneno() {
    return phoneno;
  }

  public void setEmergency(boolean flag) {
    this.emergency = flag;
  }

  public void copy(String c) {
    // The copy method copies the attributes of c object into a contact object. The
    // toString method returns the name, phoneno and emergency status of a contact.
    /*
     * c source = new c(); Contact target = new Contact(); mapper.map(source,
     * target);
     */
    System.out.println(c);

  }

  @Override
  public String toString() {
    return "[Name: " + name + ", Phone No: " + phoneno + ", Emergency: " + emergency + " ]";
  }

}

class Phonebook {
  private Contact[] contacts = new Contact[3];
  private int size;
  int p = 0;

  public Phonebook() {

  }

  public Phonebook(int capacity) {
    // contacts = new Contact[capacity];
    this.size = capacity;
  }

  public Contact[] getContact() {
    return contacts;
  }

  public int getSize() {
    return size;
  }

  public String getIndex(String name) {
    return name;
  }

  public boolean addContact(Contact c) {
    // The addContact copies the c object in an empty entry in the contact list. It
    // returns false when there is no space in the list.
    contacts[p++] = c;
    boolean a;

    // if (size > getContact().length)

    // a = true;
    // else
    // a = false;
    // return a;
    return false;

  }

  public void viewAllContacts() {
    // The viewAllContacts shows all the contacts in the list,
    System.out.println("All contacts are: \n");

    for (int i = 0; i < getContact().length; i++)
      System.out.println(contacts[i]);
  }

  public void viewEmergencyContacts() {
    // the viewEmergencyContacts shows only the emergency contacts.
    for (int i = 0; i < contacts.length; i++) {
      if (contacts[i].isEmergency() == true) {
        System.out.println("Emergency contacts are: " + contacts[i]);
      }
    }

  }

  public String viewContact(String name) {
    for (int i = 0; i < getContact().length; i++) {
      if (contacts[i].getName().equals(name)) {
        return "Matched contact: " + contacts[i];
      }
    }
    return " ";
    // The viewContact shows the contact that matches with name;
  }

  public boolean check;

  public boolean delectContact(String name) {
    for (int i = 0; i < getContact().length; i++) {
      if (contacts[i].getName().equals(name)) {
        for (int j = i; j < contacts.length - 1; j++) {
          contacts[j] = contacts[j + 1];
          check = true;
          System.out.println(contacts[j].getName());
          p = contacts[j].getName().toCharArray().length;

        }

      }
    }
    return check;

  }

  public boolean deleteContant(int index) {
    for (int i = 0; i < p; i++) {
      if (i == index) {
        for (int j = i; j < contacts.length - 1; j++) {
          contacts[j] = contacts[j + 1];
        }
      }
    }
    return true;
  }

  public void deleteAll() {
    contacts = null;
    System.out.println("All Contacts have been deleted- " + contacts);
  }

  public boolean isEmpty() {
    if (contacts == null)
      return true;
    else
      return false;
  }

  public boolean isFull() {
    if (contacts == null)
      return false;
    else
      return true;
  }

}

public class PhoneBookDemo {

  public static void main(String[] args) {

    Phonebook pb = new Phonebook(5);

    Contact c1 = new Contact("Salam", "01878943930", true);
    Contact c2 = new Contact("Azad", "0153499439", false);
    Contact c3 = new Contact("Ha", "01943457879", true);

    pb.addContact(c1);
    pb.addContact(c2);
    pb.addContact(c3);

    pb.viewAllContacts();
    pb.delectContact("Azad");

    // pb.deleteContact("Rafiq");

    // pb.deleteContact("Hamza");

    Contact c4 = new Contact("Hanif", "01348672057", true);
    pb.addContact(c4);

    pb.viewAllContacts();

    pb.viewEmergencyContacts();

  }

}