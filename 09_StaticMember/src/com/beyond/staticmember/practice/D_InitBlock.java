package com.beyond.staticmember.practice;

/*
    필드의 초기화 순서
    1. 필드
        1-1). JVM이 지정한 기본값으로 초기화
        1-2). 명시적 초기화 (선언과 함께 초기화)
        1-3). 인스턴스 블록을 이용한 초기화
        1-4). 생성자를 이용한 초기화
    2. 정적(Static) 필드
        2-1). JVM이 지정한 기본값으로 초기화
        2-2). 명시적 초기화
        2-3). static 블록을 이용한 초기화
        // 정적 필드는 생성자를
 */
public class D_InitBlock {
    // 1. JVM이 정한 기본값으로 초기화
    // private String name;
    // private static int age;

    // 2. 명시적 초기화
    private String name = "홍길동";
    private static int age = 34;

    // 3. 초기화 블록을 이용한 초기화
    // 3-1). 인스턴스 블록
    // - 필드를 초기화 하는 블록으로 객체 생성 시마다 실행되고 초기화한다.
    {
        name = "이몽룡";
        // age = 50;
    }

    // 3-2). static 블록
    // - 정적 필드를 초기화 하는 블록으로 클래스가 로드될 때 단 한번만 실행되고 초기화한다.
    static {
        age = 40;

        // static 블록에서는 필드를 초기화할 수 없다. -> 객체를 생성하지 않기 때문이다.
        // 반대로, 인스턴스 블록에서는 정적 필드를 초기화 할 수 있다. 단, 데이터를 덮을 위험 존재
        // name = "성춘향";
    }

    // 4). 생성자를 이용한 초기화
    public D_InitBlock() {
        this.name = "임꺽정";
    }

    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }
}
