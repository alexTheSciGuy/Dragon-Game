package com.company;

import java.util.Scanner;

public class Student {

    private String fname;
    private String lname;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor prompt user to enter  student's name and year

    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student's first name: ");
        this.fname = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lname = in.nextLine();

        System.out.print("1 = Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentId();
        System.out.println(fname + " " + lname + " " + gradeYear + " " + studentID);


    }

    // generate an ID
    private void setStudentId() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll() {
        // inside of a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {break;}
        } while (1 != 0);
    System.out.println("ENROLLED IN: " + courses);
    //System.out.println("TUITION BALANCE: " + tuitionBalance);
    }
    //View balance
    public void viewBalance() {
        System.out.println(" Your balance is: $" + tuitionBalance);
    }
    //Pay Tuition
    public void payTuition(){
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Show Status
    public String toString() {
        return "Name: " + fname + " " + lname + "\nCourse Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
    }
}
