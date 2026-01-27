package com.beyond.array;

import com.beyond.array.practice.A_Array;
import com.beyond.array.practice.B_TwoDimensionalArray;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 배열 테스트
        A_Array a = new A_Array();

        // a.method01();
        // a.method02();
        // a.method03();
        // a.method04();

        // 배열 실습 문제
        // a.practice1();
        // a.practice2();

        // 2차원 배열
        B_TwoDimensionalArray b = new B_TwoDimensionalArray();
        // b.method01();
        // b.method02();

        // 2차원 배열 실습 문제
        // b.practice1();
        b.practice2();
    }
}
