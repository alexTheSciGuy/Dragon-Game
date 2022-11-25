package com.company;
import java.lang.System;
import java.lang.String;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
Implement a function that can solve the following problem:

Given a number A, find the smallest number which has only 1s and 0s as its digits which are divisible by the number A.

For example:

If the given number A is 4, the smallest number with 1s and 0s which is divisible by 4 is 100.

If the given number A is 3, the answer would be 111.
*/

public class Divide {
    public static void main(String[] args) {
        //object for the class GFG
        GFG gfg = new GFG();
        //creates user input
        Scanner myO = new Scanner(System.in);

        //Asks user to enter a number
        System.out.println("Enter a number: ");
        int input = Integer.parseInt(myO.nextLine());

        //should print out what the users output is
        System.out.println(gfg.smallestOneZeroMultiple(input));
    }


}

class GFG {
    //starts looking for the smallest multiple of the input number and increments up until it can't anymore
    int smallestOneZeroMultiple(int div) {
        int INT_MAX = 11111111;
        for (int i = 0; i < INT_MAX; i++) {
            if (i % div == 0) {
                if (CheckOnlyOneZero(i)) {
                    return i;
                }
            }
        }



    }

// checks to see if the number has a one or a zero in the multiple
    void CheckOnlyOneZero(int num) {
        while (num > 0) {
            int digit = num % 10;

            if (digit > 1)
                return false;
            else
                return true;
        }
    }
}