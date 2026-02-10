package com.beyond.streamapi;

import com.beyond.streamapi.practice.A_Stream;
import com.beyond.streamapi.practice.B_Filtering;
import com.beyond.streamapi.practice.C_Sort;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 스트림 생성
//        new A_Stream().method01();
//        new A_Stream().method02();
//        new A_Stream().method03();

        // 중간 처리 메서드
//        new B_Filtering().method01();
//        new B_Filtering().method02();

        // 중간 처리 메서드 (정렬)
//        new C_Sort().method01();
        new C_Sort().method02();
    }
}
