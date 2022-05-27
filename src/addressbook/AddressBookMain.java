package addressbook;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("----Welcome to Address Book Program----");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an Option: ");
        System.out.println("1. Add new Contact");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                addressBook.add();
                break;
            default:
                System.out.println("Please choose a valid number.");
        }

    }
}
