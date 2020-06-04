package com.example.attempt7.Helper.HomeAdapter;

public class ProductHelperClass {

    int image;
    String name, price;

    public ProductHelperClass(int image, String name, String price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
