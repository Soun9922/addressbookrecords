package addressbook;

import java.util.ArrayList;
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
        personInfo.setEmailId(sc.nextLine());
        persons.add(personInfo);
        printDetails();
    }
    PersonInfo isCheck() {
        PersonInfo personInfoCheck = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be edited: ");
        String name = sc.next();
        int i;
        for (i = 0; i < persons.size(); i++) {
            if (name.equals(persons.get(i).getFirstName())) {
                personInfoCheck = persons.get(i);
            }
        }
        return personInfoCheck;
    }
    void editDetails() {
        PersonInfo personInfoEdit = null;
        personInfoEdit = isCheck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        personInfo.setFirstName(sc.next());
        System.out.println("Enter Last name: ");
        personInfo.setLastName(sc.next());
        System.out.println("Enter Address: ");
        personInfo.setAddress(sc.next());
        System.out.println("Enter City : ");
        personInfo.setCity(sc.next());
        System.out.println("Enter State: ");
        personInfo.setState(sc.next());
        System.out.println("Enter zip: ");
        personInfo.setZipCode(sc.nextInt());
        System.out.println("Enter Phone Number: ");
        personInfo.setPhNumber(sc.nextLong());
        System.out.println("Enter Email-ID: ");
        personInfo.setEmailId(sc.next());
        persons.add(personInfoEdit);
    }
    void printDetails() {
        System.out.println(" These are the Contact Details \n");
        System.out.println("Name : " + personInfo.getFirstName() + " " + personInfo.getLastName() + "\n" + "Address : " + personInfo.getAddress() + "\n" + "City : " + personInfo.getCity() + "\n" + "State : " + personInfo.getState() + "\n" + "Zip : " + personInfo.getZipCode() + "\n" + "Mobile Number : " + personInfo.getPhNumber() + "\n" + "EmailId : " + personInfo.getEmailId() + "\n");
    }

}



