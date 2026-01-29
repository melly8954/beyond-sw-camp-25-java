package com.beyond.staticmember.practice;

public class C_StaticFinalField {
    // final 필드 초기화 방법
    // 1. 선언 시 명시적으로 초기화하는 방법
    // private final String gender = "남자";
    // 다음과 같이 초기화 하면 성별은 여자를 정할 수 없음

    // 2. 생성자를 사용하여 초기화하는 방법
    // final 필드 선언 후 생성자를 통해 초기화
    private final String gender;


    // 상수(static final) 선언
    public static final int MAX_LEVEL = 99;

    // 기본 생성자로 만들 경우 final 필드를 초기화 하지 않으면 에러
//    public C_StaticFinalField() {
//        gender = "남자";
//    }

    // 생성자를 사용한 final 필드 초기화
    public C_StaticFinalField(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    // gender는 final 필드라서 setter를 사용할 수 없다.
    // public void setGender(String gender) {
    //    this.gender = gender;
    // }

}
