package com.beyond.staticmember.practice;

public class A_StaticField {
    // 정적 필드
    // 정적 필드는 클래스가 로드될 때 생성되고 프로그램이 종료될 때 소멸된다.
    public static int number = 101;

    private static String messgae = "Hello World";

    // 정적 필드에 대한 Getter, Setter 메서드도 static 키워드를 사용해서 접근한다.
    public static String getMessage() {
        return messgae;
    }

    public static void setMessage(String message) {
        // 정적 필드는 객체를 생성하지 않고 접근하기 때문에 this로 접근할 수 없음
        // this.message = message;
        A_StaticField.messgae = message;
    }
}
