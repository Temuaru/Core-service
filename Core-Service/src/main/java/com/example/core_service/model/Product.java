package com.example.core_service.model;

public class Product {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    // Геттеры и сеттеры (можно использовать Lombok @Data для сокращения кода)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
