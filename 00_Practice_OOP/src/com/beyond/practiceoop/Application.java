package com.beyond.practiceoop;

import com.beyond.practiceoop.practice01.Product;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
        System.out.println(p1.information());
        System.out.println(p2.information());
        System.out.println(p3.information());
        System.out.println("=====================================================");

        p1.setPrice(1200000);
        p1.setTax(0.05);
        p2.setPrice(1200000);
        p2.setTax(0.05);
        p3.setPrice(1200000);
        p3.setTax(0.05);

        System.out.println(p1.information());
        System.out.println(p2.information());
        System.out.println(p3.information());
        System.out.println("=====================================================");

        int result1 = p1.getPrice() + (int) (p1.getPrice() * p1.getTax());
        int result2 = p2.getPrice() + (int) (p2.getPrice() * p2.getTax());
        int result3 = p3.getPrice() + (int) (p3.getPrice() * p3.getTax());

        System.out.println("상품명 = " + p1.getName());
        System.out.println("부가세 포함 가격 = " + result1);

        System.out.println("상품명 = " + p2.getName());
        System.out.println("부가세 포함 가격 = " + result2);

        System.out.println("상품명 = " + p3.getName());
        System.out.println("부가세 포함 가격 = " + result3);
    }
}
