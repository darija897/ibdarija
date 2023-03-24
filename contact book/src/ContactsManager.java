import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.io.*;


public class ContactsManager{
    private List<Contact> contacts = new ArrayList<>(); //contacts - pr iv, empty ArrayList

    public void addContact(Contact contact) { //takes a parameter of type Contact and adds it to the arraylist "contacts"
        contacts.add(contact);
    }
    public void editContact(int index, Contact contact){ // sets the Contact object at a particular index in the "contacts"
        contacts.set(index, contact);
    }

    public void deleteContact(int index){
        contacts.remove(index);
    }
    public Contact getContact(int index){ //returns the Contact object at the index
        return contacts.get(index);
    }
    public List<Contact> getAllContacts() { //other classes can access the entire list for contacts for displaying it/manipulating
        return contacts;
    }
    public ContactsManager readContactsFromFile(String filename) {
        ContactsManager contactsManager = new ContactsManager();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

//                System.out.print(data);

                String[] tokens = data.split(",");
                Contact contact = new Contact(tokens[0], tokens[1], tokens[2]);
                contactsManager.addContact(contact);

//                System.out.print(contact.toString());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
        return contactsManager;
    }

}
