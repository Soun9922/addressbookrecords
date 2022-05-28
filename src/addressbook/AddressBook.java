package addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<PersonInfo> persons = new ArrayList<>();
    PersonInfo personInfo;

    void add() {
        personInfo = new PersonInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        personInfo.setFirstName(sc.nextLine());
        System.out.println("Enter Last name: ");
        personInfo.setLastName(sc.nextLine());
        System.out.println("Enter Address: ");
        personInfo.setAddress(sc.nextLine());
        System.out.println("Enter City : ");
        personInfo.setCity(sc.nextLine());
        System.out.println("Enter State: ");
        personInfo.setState(sc.nextLine());
        System.out.println("Enter zip: ");
        personInfo.setZipCode(sc.nextInt());
        System.out.println("Enter Phone Number: ");
        personInfo.setPhNumber(sc.nextLong());
        System.out.println("Enter Email-ID: ");
        personInfo.setEmailId(sc.next());
        persons.add(personInfo);
        printDetails();
    }

    void editDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of the contact to be edited: ");
        String firstName = sc.next();
        Iterator<PersonInfo> iterator = persons.listIterator();
        boolean loopTerminal = true;
        while (iterator.hasNext()) {
            PersonInfo personInfoEdit = iterator.next();
            if (firstName.equals(personInfoEdit.getFirstName())) {
                System.out.println("Which section you want to update \n 1.FirstName \n 2.LastName \n 3.Address \n 4.City \n 5.State \n 6.ZipCode \n 7.PhoneNumber \n 8.EmailID \n 9.Exit main menu: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the First Name: ");
                        String newFirstName = sc.next();
                        personInfoEdit.setFirstName(newFirstName);
                        break;
                    case 2:
                        System.out.println("Enter the Last Name: ");
                        String newLastName = sc.next();
                        personInfoEdit.setLastName(newLastName);
                        break;
                    case 3:
                        System.out.println("Enter the Address: ");
                        String newAddress = sc.next();
                        personInfoEdit.setAddress(newAddress);
                        break;
                    case 4:
                        System.out.println("Enter the City: ");
                        String newCity = sc.next();
                        personInfoEdit.setCity(newCity);
                        break;
                    case 5:
                        System.out.println("Enter the State: ");
                        String newState = sc.next();
                        personInfoEdit.setState(newState);
                        break;
                    case 6:
                        System.out.println("Enter the Zip Code: ");
                        int newZipCode = sc.nextInt();
                        personInfoEdit.setZipCode(newZipCode);
                        break;
                    case 7:
                        System.out.println("Enter the Phone Number: ");
                        long newPhNumber = sc.nextLong();
                        personInfoEdit.setPhNumber(newPhNumber);
                        break;
                    case 8:
                        System.out.println("Enter the Email ID: ");
                        String newEmailId = sc.next();
                        personInfoEdit.setEmailId(newEmailId);
                        break;
                    default:
                        loopTerminal = false;
                        break;
                }
            }
            System.out.println("Name : " + personInfoEdit.getFirstName() + " " + personInfoEdit.getLastName() + "\n" + "Address : " + personInfoEdit.getAddress() + "\n" + "City : " + personInfoEdit.getCity() + "\n" + "State : " + personInfoEdit.getState() + "\n" + "Zip : " + personInfoEdit.getZipCode() + "\n" + "Mobile Number : " + personInfoEdit.getPhNumber() + "\n" + "EmailId : " + personInfoEdit.getEmailId() + "\n");
        }
    }
    void deleteDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be deleted: ");
        String deleteName = sc.next();
        Iterator<PersonInfo> personInfoIterator = persons.listIterator();
        while (personInfoIterator.hasNext()){
            PersonInfo personInfoDelete = personInfoIterator.next();
            if (deleteName.equals(personInfoDelete.getFirstName())){
                persons.remove(personInfo);
                System.out.println("Your contact details have been deleted");
            }
        }
    }
    void printDetails() {
        System.out.println(" These are the Contact Details \n");
        System.out.println("Name : " + personInfo.getFirstName() + " " + personInfo.getLastName() + "\n" + "Address : " + personInfo.getAddress() + "\n" + "City : " + personInfo.getCity() + "\n" + "State : " + personInfo.getState() + "\n" + "Zip : " + personInfo.getZipCode() + "\n" + "Mobile Number : " + personInfo.getPhNumber() + "\n" + "EmailId : " + personInfo.getEmailId() + "\n");

    }
}




