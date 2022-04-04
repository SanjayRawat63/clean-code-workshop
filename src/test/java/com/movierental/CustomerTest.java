package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void shouldCheckIfCustomerStatementIsCorrect() {
        Customer customer = new Customer("Sanjay");
        customer.addRental(new Rental(new Movie("Kashmiri Files", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Tom and Jerry", Movie.CHILDRENS), 4));
        customer.addRental(new Rental(new Movie("RRR", Movie.NEW_RELEASE), 2));
        assertEquals("Rental Record for Sanjay\n" +
                "\tKashmiri Files\t3.5\n" +
                "\tTom and Jerry\t3.0\n" +
                "\tRRR\t6.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points", customer.statement());

    }

}