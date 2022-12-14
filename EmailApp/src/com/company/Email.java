package com.company;

import java.util.Scanner;

public class Email {
    private String fname;
    private String lname;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "sumcompany.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        //System.out.println("Email Created: " + this.fname+ " " + this.lname);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department: "+this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        email = fname.toLowerCase() + "." + lname.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Your email is: "+ email);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("New worker: " + fname +". Department Codes \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2 ){
            return "dev";
        } else if (depChoice == 3){
            return "acct";
        } else {return "";}
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return  new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME: " + fname + "" + lname +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity+ "mb";
    }
}
