package com.beyond.iface.practice;

public class SmartPhone extends Product{
    private String mobileAgency;

    public SmartPhone() {}

    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    public SmartPhone(String code, String name, String brand, int price, String mobileAgency) {
        super(code, name, brand, price);
        this.mobileAgency = mobileAgency;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", mobileAgency='" + mobileAgency + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰을 끕니다.");
    }
}
