package com.beyond.field;

import com.beyond.field.practice.User;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 1. 접근 제한자 테스트
        User user = new User();

        // 1-1). public 접근 제한자
        user.id = "lee";
        System.out.println(user.id);
        System.out.println();

        // 1-2). protected 접근 제한자
        // 같은 패키지, 자식 클래스에서만 직접 접근 가능하다.
        // System.out.println(user.address);

        // 1-3). default 접근 제한자
        // 같은 패키지 내에서만 직접 접근이 가능하다.
        // System.out.println(user.name);

        // 1-4). private 접근 제한자
        // 클래스 내에서만 직접 접근이 가능하다.
        // System.out.println(user.password);


        // 2. 변수 구분 테스트

        // 2-1). 필드(인스턴스 변수)
        // 클래스 영역에 선언하는 변수, 클래스 내에서 어디든지 사용이 가능하다.
        // 필드는 접근 제한자를 사용할 수 있다.
        // new 연산자를 통해서 객체(인스턴스) 생성 시 메모리에 생성되고, 객체(인스턴스)가 소멸 시 함께 소멸한다.


        // 2-2). 지역 변수
        // 메서드, 생성자, 제어문 등에 선언하는 변수, 해당 구역에서만 사용이 가능하다.
        // 지역 변수는 접근 제한자를 사용할 수 없다.
        // 메서드, 생성자. 제어문 실행 시 메모리에 생성되고 메서드, 생성자, 제어문이 종료 시 함께 소멸된다.
        user.test(100);
    }
}
