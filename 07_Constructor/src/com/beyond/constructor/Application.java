package com.beyond.constructor;

import com.beyond.constructor.practice.User;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");

        // 기본 생성자
        User user = new User();
        System.out.println(user);
        System.out.println(user.information());

        // 매개 변수가 있는 생성자로 객체 생성
        user = new User("hong1234", "1234", "홍길동");
        System.out.println(user);
        System.out.println(user.information());

        user = new User("lee1234", "1234", "이몽룡", 29, '남');
        System.out.println(user);
        System.out.println(user.information());
    }
}
