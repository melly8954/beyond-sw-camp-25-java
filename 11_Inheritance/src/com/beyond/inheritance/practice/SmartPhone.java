package com.beyond.inheritance.practice;

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
    public String information() {
        return String.format("%s, mobileAgency: %s", super.information(), mobileAgency);
    }
}
