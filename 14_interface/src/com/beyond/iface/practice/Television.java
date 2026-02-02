package com.beyond.iface.practice;

public class Television extends Product {
    private int inch;

    public Television() {}

    public Television(String code, String name, String brand, int price, int inch) {
        super(code, name, brand, price);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Television{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", inch=" + inch +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("텔레비전을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전을 끕니다.");
    }
}
