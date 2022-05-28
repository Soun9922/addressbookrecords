package addressbook;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("----Welcome to Address Book Program----");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Select an Option: ");
<<<<<<< HEAD
            System.out.println("1. Add new Contacts");
            System.out.println("2. Edit existing contacts");
            System.out.println("3. Delete Contatcts");
=======
            System.out.println("1. Add new Contact");
            System.out.println("2. Edit existing contact");
>>>>>>> UC4_abilitytodelete
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    addressBook.editDetails();
                    break;
<<<<<<< HEAD
                case 3:
                    addressBook.deleteDetails();
                    break;
                default:
                    System.out.println("Please choose a valid number.");
                    break;
            }
=======
                default:
                    System.out.println("Please choose a valid number.");
            }

>>>>>>> UC4_abilitytodelete
        } while (true);
    }
}


