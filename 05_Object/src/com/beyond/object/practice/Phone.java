package com.beyond.object.practice;

class Phone {
    // 1. 필드 정의
    private String name;

    private String color;

    private String brand;

    // 2. 생성자 정의
    Phone() {

    }

    // 3. 메서드 정의
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
