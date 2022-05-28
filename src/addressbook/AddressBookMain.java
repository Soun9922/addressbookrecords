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
            System.out.println("1. Add new Contacts");
            System.out.println("2. Edit existing contacts");
            System.out.println("3. Delete Contatcts");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.add();
                    break;
                case 2:
                    addressBook.editDetails();
                    break;
                case 3:
                    addressBook.deleteDetails();
                    break;
                default:
                    System.out.println("Please choose a valid number.");
                    break;
            }
        } while (true);
    }
}


