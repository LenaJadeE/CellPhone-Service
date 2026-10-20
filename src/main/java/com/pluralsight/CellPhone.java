package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}


// EXERCISE 2
// Open your cellphone-service application.  Modify the CellPhone class as follows.
// Step 1
// Add a dial(String phoneNumber) method to the CellPhone class that will accept a phone number parameter and displays the message "owner's phone is calling phone-parameter"
// Example
// cellPhone1.dial("855-555-2222");
/// /This would display: Dana Wyatt's phone is calling 855-555-2222
// Back in the main() method, create a second instance of the CellPhone class.
// In your CellPhoneApplication class, add a static method called display() that accepts a CellPhone object as a parameter.  (see below)
// public static void display(CellPhone phone) {
// }
// Use this method to print and format some of the property values from the CellPhone parameter phone.
// Then call that method twice from within your main method -- passing your two CellPhone objects.
//  display(cellPhone1);
//  display(cellPhone2);
// Exercises – Cell Phone Service
// Finally, write code to have your first cell phone dial your second one using the code: cellPhone1.dial(cellPhone2.getPhoneNumber());
// Then your second cell phone dial your first one using the code: cellPhone2.dial(cellPhone1.getPhoneNumber());
// Step 2
//  1. Ensure all your changes are committed and pushed to GitHub
//  2. Send your repository URL to your Instructor