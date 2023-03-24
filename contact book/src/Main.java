import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactsManager contactsManager = new ContactsManager();

                while (true){
            System.out.println("Select an option (list, add, edit, delete, exit, save, open): ");
            String option = scanner.nextLine();

            switch (option) {

                case "open":
                    contactsManager.readContactsFromFile("info.txt");
                    break;

                case "save":
                    try{
                        FileWriter fw = new FileWriter("info.txt");
                       //List<Contact> contacts = contactsManager.getAllContacts();

                      // Contact contact = contacts.getNext();
                        for (Contact contact : contactsManager.getAllContacts()) {
                            fw.write(contact.getName() + "," + contact.getPhoneNum() + "," + contact.getEmail());
                        }
                    }
                    catch (IOException e){
                        System.out.println("error");
                    }
                    break;

                case "list":
                List<Contact> contacts = contactsManager.getAllContacts();
                for (Contact contact : contacts) {
                    System.out.println("Name: " + contact.getName());
                    System.out.println("Phone number: " + contact.getPhoneNum());
                    System.out.println("Email: " + contact.getEmail());
                    System.out.println("--------------------");
                }
                break;

                /*case "list":

                    for (Contact contact : contactsManager.getAllContacts()) {
                        System.out.println("Contact's name: " + contact.getName());
                        System.out.println("Contact's phone number: " + contact.getPhoneNum());
                        System.out.println("Contact's email address: " + contact.getEmail());
                        System.out.println();
                    }
                    break;
                    */


                case "add":
                    System.out.println("Enter contact's name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter contact's phone number: ");
                    String phoneNum = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    contactsManager.addContact(new Contact(name, phoneNum, email));
                    System.out.println("The contact was added!");
                    break;

                case "delete":
                    System.out.println("Enter an index: ");
                    int deleteIndex = Integer.parseInt(scanner.nextLine());
                    contactsManager.deleteContact(deleteIndex);
                    System.out.println("The contact was deleted!");
                    break;

                case "edit":
                    System.out.println("Enter an index: ");
                    int editIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter a name: ");
                    String editName = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String editPhoneNumber = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String editEmail = scanner.nextLine();
                    contactsManager.editContact(editIndex, new Contact(editName, editPhoneNumber, editEmail));
                    System.out.println("The contact was edited!");


                /*case "edit":
                System.out.println("Enter an index: ");
                int editIndex = Integer.parseInt(scanner.nextLine());
                System.out.println("edit a name?");
                String answer1 = scanner.nextLine();
                    if(answer1.compareTo("yes") == 0) {
                        System.out.println("Enter a name: ");
                        String editName = scanner.nextLine();
                        else if{
                            System.out.println("edit a phone number?");
                            String answer2 = scanner.nextLine();
                            if (answer2.compareTo("yes") == 0) {
                                System.out.println("Enter phone number: ");
                                String editPhoneNumber = scanner.nextLine();
                        else if {
                                    System.out.println("edit an email?");
                                    String answer3 = scanner.nextLine();
                                    if (answer3.compareTo("yes") == 0) {
                                        System.out.println("Enter email: ");
                                        String editEmail = scanner.nextLine();
                                        contactsManager.editContact(editIndex, new Contact(editName, editPhoneNumber, editEmail));
                                        System.out.println("The contact was edited!");
                                    }
                                }
                            }
                        }
                    }
                    break;
*/
             /*   case "edit":
                    System.out.println("Enter an index: ");
                    int editIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println("What do you want to edit: name/phone number/email?");
                    String answer1 = scanner.nextLine();
                    if (answer1.compareTo("name") == 0) {
                        System.out.println("Enter a name: ");
                        String editName = scanner.nextLine();
                        contactsManager.editContact(editIndex, new Contact(editName), contact.getPhoneNumber, contact.getEmail);
                    }
                        if (answer1.compareTo("phone number") == 0) {
                            System.out.println("Enter phone number: ");
                            String editPhoneNumber = scanner.nextLine();
                            //contactsManager.editContact(editIndex, new Contact(editPhoneNumber));
                            if (answer1.compareTo("email") == 0) {
                                System.out.println("Enter email: ");
                                String editEmail = scanner.nextLine();
                                //contactsManager.editContact(editIndex, new Contact(editEmail));


                                //contactsManager.editContact(editIndex, new Contact(editName, editPhoneNumber, editEmail));

                    System.out.println("The contact was edited!");
                    break;
*/


              /*  case "get":
                    System.out.println("Enter a contact index: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    return contacts.get(index);
                    break;
                    */



                case "exit":
                    return;
                default:
                    System.out.println("Try again");
        }
    }

}

}
