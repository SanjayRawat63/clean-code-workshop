package com.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

    double totalAmount() {
        double totalAmount=0;
        for (Rental rental : this) {
            totalAmount += rental.amount();}
        return totalAmount;
    }

    int totalFrequentRenterPoints() {
        int frequentRenterPoints=0;
        for (Rental rental : this) {
            frequentRenterPoints += rental.FrequentRenterPoints();}
        return frequentRenterPoints;
    }
}
