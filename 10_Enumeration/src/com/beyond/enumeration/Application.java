package com.beyond.enumeration;

import com.beyond.enumeration.practice.Week;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        Week today = Week.THURSDAY;

        // 열거 상수에서 제공하는 메서드
        System.out.println(Week.THURSDAY.name());
        System.out.println(today.name());
        System.out.println(today.ordinal());
        System.out.println(today.equals(Week.SUNDAY));
        System.out.println(today.compareTo(Week.FRIDAY));
        System.out.println();

        Week friday = Week.valueOf("FRIDAY");
        System.out.println(friday);

        // 열거 타입에서 기본적으로 제공하는 정적 메서드
        Week[] weeks = Week.values();
        System.out.println(today);
        System.out.println(Arrays.toString(weeks));;
        System.out.println();


        // 열거 타입에 속성 추가 후 실행
        System.out.println(today.getFullName());
        System.out.println(today.getShortName());
        System.out.println(today.getValue());
        System.out.println();
    }
}
