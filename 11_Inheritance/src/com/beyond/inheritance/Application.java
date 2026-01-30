package com.beyond.inheritance;

import com.beyond.inheritance.practice.Book;
import com.beyond.inheritance.practice.Desktop;
import com.beyond.inheritance.practice.SmartPhone;
import com.beyond.inheritance.practice.Television;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // Desktop 객체 생성
        // 부모 생성자를 먼저 호출 후 자식 생성자 호출
        // 기본 생성자 호출
//        Desktop desktop = new Desktop();

        // Product를 상속한 Desktop 필드
//        desktop.setCode("a111");
//        desktop.setName("아이맥 24인치");
//        desktop.setBrand("애플");
//        desktop.setPrice(1200000);

        // Desktop 필드
//        desktop.setAllInOne(true);

//        System.out.println(desktop.information());
//        System.out.println(desktop.isAllInOne());
//        System.out.println();

        // 매개 변수가 있는 생성자 호출
        Desktop desktop = new Desktop(
                "a111", "아이맥 24인치", "애플", 1200000, true
        );

//        System.out.println(desktop.isAllInOne());

        // SmartPhone 객체 생성 (매개변수가 있는 생성자 호출)
        SmartPhone smartPhone = new SmartPhone(
                "a222", "아이폰 15 프로", "애플", 990000, "KT"
        );

        // Television 객체 생성 (매개변수가 있는 생성자 호출)
        Television television = new Television(
                "a333", "벽걸이 TV", "LG", 2000000, 50
        );

        System.out.println(desktop.information());
        System.out.println(smartPhone.information());
        System.out.println(television.information());
        System.out.println();

        // Object 클래스의 메서드 오버라이딩
        Book book1 = new Book("자바의 정석", "남궁성", 30000);
        Book book2 = new Book("자바의 정석", "남궁성", 30000);
        Book book3 = new Book("혼자 공부하는 자바", "신용권", 28000);

        System.out.println(book1.information());
        System.out.println(book2.information());
        System.out.println(book3.information());
        System.out.println();

        // 1. Object클래스의 toString() 메서드 테스트
//        System.out.println(book1.toString());
//        System.out.println(book2.toString());
//        System.out.println(book3.toString());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println();

        // 2. Object클래스의 equals() 메서드 테스트
        System.out.println(book1 == book2);             // false
        System.out.println(book1.equals(book2));        // false
        System.out.println(book1.equals(book3));        // false
        System.out.println();

        // 2-1). equals() 메서드 오버라이딩 이후
        System.out.println(book1.equals(book2));        // true
        System.out.println(book1.equals(book3));        // false
        System.out.println();

        // cf). 문자열 비교 시 equals() 역시 오버라이딩 한 것
        String t = "test";
        System.out.println("t".equals(t));
        System.out.println();

        // 3. hashCode() 테스트
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println();
    }
}
