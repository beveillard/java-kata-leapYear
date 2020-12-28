/*
 * Write a function that returns true or false depending on whether
 * its input is a leap year or not.
 *
 * A leap year is divisible by 4,
 * but is not otherwise divisible by 100,
 * unless it is also divisible by 400.
 */

package com.benoiteveillard.kata;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (isMultipleOf(400, year)) {
            return true;
        }
        if (isMultipleOf(100, year)) {
            return false;
        }
        if (isMultipleOf(4, year)) {
            return true;
        }
        return false;
    }

    private static boolean isMultipleOf(int multiple, int year) {
        return year % multiple == 0;
    }

}
