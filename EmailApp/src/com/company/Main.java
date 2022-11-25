package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Generate an email with the following syntax: firstname.lastname@department.company.com
        Determine the department (sales, development, accounting), if none leave blank
        Generate a random String for a password
        Have set methods to change the password, set the mailbox capacity, and define an alternate email address
        Have get methods to display the name, email, mailbox capacity
         */
        Email em1 = new Email("John", "Smith");

        System.out.println(em1.showInfo());
    }
}
