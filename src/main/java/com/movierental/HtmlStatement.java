package com.movierental;

class HtmlStatement {

    public String display(Rentals rentals, String customerName) {
        String result = "<h1>Rental Record for <b>" + customerName + "</b></h1><br>";
        for (Rental rental : rentals) {

            result += rental.getMovie().getTitle() + " " +
                    String.valueOf(rental.amount()) + "<br>";
        }

        result += "Amount owed is <b>" + String.valueOf(rentals.totalAmount()) + "</b> <br>";
        result += "You earned <b>" + String.valueOf(rentals.totalFrequentRenterPoints())
                + "</b> frequent renter points";
        return result;
    }
}
