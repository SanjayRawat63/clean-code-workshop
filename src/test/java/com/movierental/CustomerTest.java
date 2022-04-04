package com.movierental;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void shouldCheckIfCustomerStatementIsCorrect(){
        Customer customer=new Customer("Sanjay");
        customer.addRental(new Rental(new Movie("RRR",Movie.REGULAR),2));
        assertEquals("Rental Record for Sanjay\n" +
                "\tRRR\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points",customer.statement());

    }

}