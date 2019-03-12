package com.leapley.Week9;
/*
Hudson Leapley 3/12/2019
Create an abstract class for contacts that stores a contact's name
and defines an abstract method contact(). Create one class that makes
use of the abstract contact class that stores an email address and
implements the contact() method using the email address and another
class that stores a phone number and implements the contact() method
using the phone number. The implementation of the contact() method
should simply print a string with the appropriate information like
"Emailing aneuman1@cscc.edu" or "Calling 123-456-7890".
 */
public class Main {

    public static void main(String[] args) {
	EmailContacts email = new EmailContacts("hudson.d.leapley@gmail.com");
	PhoneContacts phone = new PhoneContacts("614-940-9657");

	email.contact();
	phone.contact();
    }
}

abstract class Contacts{ //Abstract contacts class
    Contacts(){
    }
    abstract public void contact();
}
class EmailContacts extends Contacts{
    private String email;

    public EmailContacts(String email){
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    } //Contact that certain email
}
class PhoneContacts extends Contacts{
    private String phone;

    public PhoneContacts(String phone){
        this.phone = phone;
    }
    @Override
    public void contact() {
        System.out.println("Calling " + phone);
    }//Contact that phone by calling it
}

