package com.pluralsight;

import java.util.Scanner;


public class CellPhoneApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        CellPhone phone1 = readPhoneFromUser(scanner);
        CellPhone phone2 = new CellPhone(4568931, "IPhoneX", "AT&T", "214-555-4351", "Mike Jones");
        CellPhone phone3 = new CellPhone(6548798, "Galaxy S", "T-Mobile", "568-664-3596", "Eve Dells");
        //Level up
        System.out.println();
        display(phone1);
        System.out.println(("Valid number? " + phone1.isValidPhoneNumber()));

        System.out.println();
        display(phone2);

        System.out.println();
        display(phone3);

        System.out.println();
        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
        phone1.dial(phone3);
        phone1.dial(phone1); //Refused the same number.

        scanner.close();
    }

    private static CellPhone readPhoneFromUser(Scanner scanner) {
        CellPhone phone = new CellPhone();

        phone.setSerialNumber(Integer.parseInt(prompt(scanner, "What is the Serial Number? ")));
        phone.setModel(prompt(scanner, "What model is the phone? "));
        phone.setCarrier(prompt(scanner, "Who is the carrier? "));
        phone.setPhoneNumber(prompt(scanner,"What is the phone number? "));
        phone.setOwner(prompt(scanner,"Who is the owner of the phone? "));

        return phone;
    }

    private static String prompt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    public static void display(CellPhone phone) {
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }
}

//EXERCISE 1

// Step 1
//  Create a class named CellPhoneApplication and add the main() method.
//  Create a separate class named CellPhone.
//  This class will be your blueprint for creating CellPhone object instances. Similar to your own CellPhone!
//  The class should have the following data members (properties): -
//      serialNumber  (ex:  1000000 - 9999999) - - - -
//      model  (ex: iPhone X)
//      carrier  (ex: AT&T)
//      phoneNumber  (ex: 800-555-5555)
//      owner  (ex: Dana Wyatt)
//  Add a parameterless constructor (a constructor without parameters).
//  Provide the following default values in the constructor.  - - - - -
//      serialNumber = 0 (ex: 1000000 – 9999999)
//      model = ""
//      carrier = ""
//      phoneNumber = ""
//      owner = ""
// Provide getter and setter methods for all 5 data members.
// Step 2
//  Verify that your class is built correctly by creating a new instance of a CellPhone in your CellPhoneApplication's main() method.
//  Create a new instance of a CellPhone without any starter data, then prompt the
//  user for the cell phone information:
//      What is the serial number? 2597153
//      What model is the phone? iPhone 15 Pro Max
//      Who is the carrier? Verizon
//      What is the phone number? 888-555-1234
//      Who is the owner of the phone? Sandra
//  Use the setters of your CellPhone object to add the values entered by the user.
//  Using the getters of the CellPhone print the properties of the phone to the screen.
//  Step 3
//      1. Ensure all your changes are committed and pushed to GitHub
//      2. Send your repository URL to your Instructor
