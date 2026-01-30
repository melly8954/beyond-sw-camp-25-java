package com.beyond.polymorphism.practice;

public class Desktop extends Product{
    private boolean allInOne;

    public Desktop() {
        System.out.println("자식 생성자의 기본 생성자 호출");
    }

    public Desktop(String code, String name, String brand, int price, boolean allInOne) {
        super(code, name, brand, price);
        this.allInOne = allInOne;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", allInOne=" + allInOne +
                '}';
    }
}
