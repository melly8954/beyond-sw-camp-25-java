package com.beyond.api;

import com.beyond.api.practice.A_String;
import com.beyond.api.practice.B_Wrapper;
import com.beyond.api.practice.C_DateTime;

// 기본 API(Application Programming Interface)
// - API는 운영체제나 서버, 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.
// - 자바에서 API는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 의미한다.
public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 문자열과 관련된 클래스
//        new A_String().method01();
//        new A_String().method02();
//        new A_String().method03();

        // Wrapper 클래스
//        new B_Wrapper().method01();
//        new B_Wrapper().method02();

        // 날짜와 시간과 관련된 클래스
//        new C_DateTime().method01();
        new C_DateTime().method02();
    }
}
