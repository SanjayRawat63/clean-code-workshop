package com.movierental;

import java.util.ArrayList;


public class Rentals extends ArrayList<Rental> {

    double totalAmount(Rentals rentals) {
        return rentals.stream().map(rental -> rental.amount()).reduce(0.0D,Double::sum);
    }

    int totalFrequentRenterPoints(Rentals rentals) {
        return rentals.stream().map(rental -> rental.FrequentRenterPoints()).reduce(0,Integer::sum);
    }
}
