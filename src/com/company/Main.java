package com.company;

public class Main {

    public static void main(String[] args) {
     Hamburger hamburger = new Hamburger("Basic ", " Sausage" , "Wheat ", 3.56);
     hamburger.addHamburgerAddition1("Tomato", 0.27);
     hamburger.addHamburgerAddition2("Lettuce", 0.75);
     hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemsOrderedAndPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy", "Bacon", "Brown rye", 5.67);

        healthyBurger.addHamburgerAddition1("Eggg", 5.43);
        healthyBurger.itemsOrderedAndPrice();
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemsOrderedAndPrice());
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemsOrderedAndPrice();

    }
}
