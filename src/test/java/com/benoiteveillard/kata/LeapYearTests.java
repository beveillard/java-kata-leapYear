/*
 * Write a function that returns true or false depending on whether
 * its input is a leap year or not.
 *
 * A leap year is divisible by 4,
 * but is not otherwise divisible by 100,
 * unless it is also divisible by 400.
 */

package com.benoiteveillard.kata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTests {

    @Test
    @DisplayName("2020 is a leap Year")
    void verifyThat2020IsALeapYear() {
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    @DisplayName("2019 is not a leap Year")
    void verifyThat2019IsNotALeapYear() {
        assertFalse(LeapYear.isLeapYear(2019));
    }

    @Test
    @DisplayName("2018 is not a leap Year")
    void verifyThat2018IsNotALeapYear() {
        assertFalse(LeapYear.isLeapYear(2018));
    }

    @Test
    @DisplayName("2100 is not a leap Year")
    void verifyThat2100IsNotALeapYear() {
        assertFalse(LeapYear.isLeapYear(2100));
    }

    @Test
    @DisplayName("2200 is not a leap Year")
    void verifyThat2200IsNotALeapYear() {
        assertFalse(LeapYear.isLeapYear(2200));
    }

    @Test
    @DisplayName("2000 is a leap Year")
    void verifyThat2000IsALeapYear() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    @DisplayName("2400 is a leap Year")
    void verifyThat2400IsALeapYear() {
        assertTrue(LeapYear.isLeapYear(2400));
    }
}
