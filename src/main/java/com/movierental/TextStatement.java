package com.movierental;

import java.util.stream.Collectors;

class TextStatement {
    public String display(Rentals rentals, String customerName) {
        String result = "Rental Record for " + customerName + "\n";

        result += rentals.stream().map(rental -> "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.amount()) + "\n").collect(Collectors.joining());

        result += "Amount owed is " + String.valueOf(rentals.totalAmount(rentals)) + "\n";
        result += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints(rentals))
                + " frequent renter points";
        return result;
    }
}
