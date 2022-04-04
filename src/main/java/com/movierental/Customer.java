package com.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {

        String result = "Rental Record for " + getName() + "<br>";
        for (Rental rental : rentals) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(rental.amount()) + "<br>";
        }

        //add footer lines result
        result += "Amount owed is " + String.valueOf(totalAmount()) + "<br>";
        result += "You earned " + String.valueOf(frequentRenterPoints())
                + " frequent renter points";
        return result;
    }

    private int frequentRenterPoints() {
        int frequentRenterPoints=0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.FrequentRenterPoints();}
        return frequentRenterPoints;
    }

    private double totalAmount() {
        double totalAmount=0;
        for (Rental rental : rentals) {
            totalAmount += rental.amount();}
        return totalAmount;
    }

    public String htmlstatement() {
        String result = "<h1>Rental Record for <b>" + getName() + "</b></h1><br>";
        for (Rental rental : rentals) {
            //show figures for this rental
            result += rental.getMovie().getTitle() + " " +
                    String.valueOf(rental.amount()) + "<br>";
        }

        //add footer lines result
        result += "Amount owed is <b>" + String.valueOf(totalAmount()) + "</b> <br>";
        result += "You earned <b>" + String.valueOf(frequentRenterPoints())
                + "</b> frequent renter points";
        return result;
    }
}


