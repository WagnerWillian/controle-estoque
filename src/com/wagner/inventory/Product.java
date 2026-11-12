package com.wagner.inventory;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (price <= 0 || !Double.isFinite(price)) {
            throw new IllegalArgumentException("Preço inválido");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean addStock(int quantity) {
        if (quantity <= 0) {
            return false;
        }
        this.quantity += quantity;
        return true;
    }

    public boolean removeStock(int quantity) {
        if (quantity <= 0 || quantity > this.quantity) {
            return false;
        }
        this.quantity -= quantity;
        return true;
    }

    public boolean updatePrice(double newPrice) {
        if (newPrice <= 0) {
            return false;
        }
        if (!Double.isFinite(newPrice)) {
            return false;
        }
        if (newPrice < this.price * 0.60) {
            return false;
        }
        this.price = newPrice;
        return true;
    }
}
