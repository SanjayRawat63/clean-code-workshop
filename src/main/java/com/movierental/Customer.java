package com.movierental;

public class Customer {
    private String name;
    private Rentals rentals = new Rentals();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String Textstatement() {
        return new TextStatement().display(this.rentals, this.getName());
    }

    public String Htmlstatement() {
        return new HtmlStatement().display(this.rentals, this.getName());
    }
}


