package com.beyond.polymorphism.practice;

public class Product {
    protected String code;
    protected String name;
    protected String brand;
    protected int price;

    public Product() {
        System.out.println("부모 클래스의 기본 생성자 호출");
    }

    public Product(String code, String name, String brand, int price) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
