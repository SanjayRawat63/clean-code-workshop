package com.movierental;

import java.util.stream.Collectors;

class HtmlStatement {

    public String display(Rentals rentals, String customerName) {
        String result = "<h1>Rental Record for <b>" + customerName + "</b></h1><br>";
        result += rentals.stream().map(rental -> rental.getMovie().getTitle() + " " +
                String.valueOf(rental.amount()) + "<br>").collect(Collectors.joining());

        result += "Amount owed is <b>" + String.valueOf(rentals.totalAmount(rentals)) + "</b> <br>";
        result += "You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints(rentals))
                + "</b> frequent renter points";
        return result;
    }
}
