package com.beyond.iface.practice;

// Product 추상 클래스
// 객체 생성 불가
// 추상 클래스라서 Basic 인터페이스의 추상 메서드를 구현하지 않아도 된다.
// public abstract class Product implements Basic1, Basic2 처럼 다중 구현 가능
public abstract class Product implements Basic3{
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
}
