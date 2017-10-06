/*
Author: Lamperts, Dustin
Assignment: Programming Assignment Four/Five
Course: COMP B11
Instructor: Richard Miles
Date submitted: 2016/11/29
*/

public class ItemToPurchase {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase () {
        itemName = "none";
        itemDescription = "none";
        itemPrice = 0;
        itemQuantity = 0;

        return;
    }

    public ItemToPurchase (String name, String description, double price, int quantity) {
        itemName = name;
        itemDescription = description;
        itemPrice = price;
        itemQuantity = quantity;

        return;
    }

    public void setName (String name) {
        itemName = name;

        return;
    }

    public void setPrice (double price) {
        itemPrice = price;

        return;
    }

    public void setQuantity (int quantity) {
        itemQuantity = quantity;

        return;
    }

    public void setDescription (String description) {
        itemDescription = description;

        return;
    }

    public String getName () {
        return itemName;
    }

    public double getPrice () {
        return itemPrice;
    }

    public int getQuantity () {
        return itemQuantity;
    }

    public String getDescription () {
        return itemDescription;
    }

    public void printItemCost () {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    }

    public void printItemDescription () {
        System.out.println(itemName + ": " + itemDescription);
    }
}
