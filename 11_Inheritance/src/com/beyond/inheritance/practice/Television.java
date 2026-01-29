package com.beyond.inheritance.practice;

public class Television {
    private int inch;

    public Television() {}

    public Television(String code, String name, String brand, int price, int inch) {
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
