package com.beyond.staticmember;

import com.beyond.staticmember.practice.A_StaticField;
import com.beyond.staticmember.practice.B_StaticMethod;
import com.beyond.staticmember.practice.C_StaticFinalField;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 1. 정적 필드 테스트
        // 1-1). 정적 필드 생성 및 출력
//        System.out.println(A_StaticField.number);
//        System.out.println(A_StaticField.getMessage());
//        System.out.println();
//
//        // 1-2). 객체의 정적 필드 공유
//        A_StaticField a1 = new A_StaticField();
//        A_StaticField a2 = new A_StaticField();
//
//        System.out.println(a1.number);
//        System.out.println(a2.number);
//        System.out.println();

        // 1-3). 정적 필드의 Getter, Setter 메서드
//        System.out.println(A_StaticField.getMessage());
//
//        A_StaticField.setMessage("Goodbye World");
//
//        System.out.println(A_StaticField.getMessage());
//        System.out.println();


        // 2.정적 메서드 테스트
        // 2-1). 매개 변수와 반환값이 없는 정적 메서드 호출
//        B_StaticMethod.method01();
//        B_StaticMethod.method01();
//        System.out.println();

        // 2-2). 매개 변수가 없고 반환값이 있는 정적 메서드 호출
//        System.out.println(B_StaticMethod.method02());

        // 2-3). 매개 변수가 있고 반환값이 없는 정적 메서드 호출
//        B_StaticMethod.method03(100);
//        System.out.println();

        // 2-4). 매개 변수와 반환값이 있는 정적 메서드 호출
//        System.out.println(B_StaticMethod.method04());
//        System.out.println(B_StaticMethod.method04(4, 5, 15));
//        System.out.println(B_StaticMethod.method04(4, 5, 15, 25, 35));
//        System.out.println();

        // final 필드 테스트
//        C_StaticFinalField c1 = new C_StaticFinalField("남자");
//        C_StaticFinalField c2 = new C_StaticFinalField("여자");
//        System.out.println(c1.getGender());
//        System.out.println(c2.getGender());
//        System.out.println();

        // 상수 테스트
        System.out.println(C_StaticFinalField.MAX_LEVEL);
        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);
        System.out.printf("int 데이터 타입의 표현 범위는 %d ~ %d 입니다.\n",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("double 데이터 타입의 표현 범위는 %f ~ %f 입니다.\n",
                Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println();

        // C_StaticFinalField.MAX_LEVEL = 100; // 상수는 값을 변경할 수 없음

    }
}
