package com.movierental;

class TextStatement {
    public String display(Rentals rentals, String customerName) {
        String result = "Rental Record for " + customerName + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(rental.amount()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(rentals.totalAmount()) + "\n";
        result += "You earned " + String.valueOf(rentals.totalFrequentRenterPoints())
                + " frequent renter points";
        return result;
    }
}
