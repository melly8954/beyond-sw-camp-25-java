package com.beyond.field.practice;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 1. 접근 제한자 테스트
        User user = new User();

        // 1-1). public 접근 제한자
        user.id = "lee";
        System.out.println(user.id);

        // 1-2). protected 접근 제한자
        // 같은 패키지, 자식 클래스에서만 직접 접근 가능하다.
        user.address = "경기도 파주시";
        System.out.println(user.address);

        // 1-3). default 접근 제한자
        // 같은 패키지 내에서만 직접 접근이 가능하다.
        user.name = "이몽룡";
        System.out.println(user.name);

        // 1-4). private 접근 제한자
        // 클래스 내에서만 직접 접근이 가능하다.
        // System.out.println(user.password);
    }
}
