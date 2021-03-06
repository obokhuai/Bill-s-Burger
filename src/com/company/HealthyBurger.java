package com.company;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    public void addHealthyAddition1(String name, double price){
      this.healthyExtra1Name = name;
      this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemsOrderedAndPrice() {
        double hamburgerPrice = super.itemsOrderedAndPrice();
        if (this.healthyExtra1Name !=null){
            hamburgerPrice +=this.healthyExtra1Price;
            System.out.println("Added" + this.healthyExtra1Name + " for extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name !=null){
            hamburgerPrice +=this.healthyExtra2Price;
            System.out.println("Added" + this.healthyExtra2Name + " for extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
