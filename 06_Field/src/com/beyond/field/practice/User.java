package com.beyond.field.practice;

public class User {
    // 필드 선언
    public String id = "hong";

    protected String address;

    String name = "홍길동";

    private String password;

    // 메서드 선언
    // 메게 뱐수도 지역 변수로 메서드 영역에서 사용이 가능하다.
    public void test(int value) {
        // 지역 변수
        // 지역 변수에는 접근 제한자를 사용하지 않는다.
        // private int number; --> error
        int number = 20;

        // 지역 변수는 사용하기 전 반드시 초기화를 해야한다.
        System.out.println(number);

        // 매개 변수는 메서드 호출 시 반드시 값이 전달되어 오기 때문에
        // 바로 사용이 가능하다.
        System.out.println(value);

        // 필드는 클래스 전역에서 사용이 가능하다.
        // 변수가 초기화 되어 있지 않으면 JVM이 기본값으로 초기화한다.
        System.out.println(password);
        password = "123456789";
        System.out.println(password);
    }
}
