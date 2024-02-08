package com.spathak.inventorymanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class representing an item in the inventory system.
 * This class is annotated to be recognized by JPA as an entity,
 * mapping it to a table named "items" in the database.
 */
@Entity
@Table(name = "items") // Specifies the table name in the database
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate unique id
    private Long id; // Unique identifier for each item

    @Column(name = "name", nullable = false) // Maps to the "name" column in the "items" table, cannot be null
    private String name; // Name of the item

    @Column(name = "quantity") // Maps to the "quantity" column in the "items" table
    private int quantity; // Quantity of the item in stock

    @Column(name = "price") // Maps to the "price" column in the "items" table
    private double price; // Price of the item

    /**
     * Default constructor required by JPA.
     */
    public Item() {
    }

    /**
     * Constructs a new Item with the specified name, quantity, and price.
     *
     * @param name     the name of the item
     * @param quantity the quantity of the item
     * @param price    the price of the item
     */
    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

