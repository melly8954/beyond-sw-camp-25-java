package com.beyond.inheritance;

import com.beyond.inheritance.practice.Desktop;

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

        System.out.println(desktop.information());
        System.out.println(desktop.isAllInOne());

    }
}
