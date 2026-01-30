package com.beyond.inheritance.practice;

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
    public String information() {
        return String.format("%s, inch: %d", super.information(), inch);
    }
}
