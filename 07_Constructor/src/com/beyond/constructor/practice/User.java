package com.beyond.constructor.practice;

public class User {
    // 필드 선언
    private String id;
    private String password;
    private String name;
    private int age;
    private char gender;


    // 생성자 선언
    // 매개 변수가 없는 기본 생성자 (객체 생성 역할)
    public User() {

    }

    // 매개 변수가 있는 생성자 (아이디, 패스워드, 이름)
    // 객체 생성과 동시에 매개 변수 값으로 필드를 초기화
    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    // 매개 변수가 있는 생성자 (아이디, 패스워드, 이름, 나이, 성별)
    public User(String id, String password, String name, int age, char gender) {
        // this(), 생성자의 첫 줄에서만 사용, 생성자 간에 중복되는 코드를 제거
        // 생성자의 매개변수 타입과 순서에 맞게 전달해야 한다.
        this(id, password, name);
        this.age = age;
        this.gender = gender;
    }

    // 메서드 선언
    public String information() {
        System.out.println(this);
        return String.format("%s, %s, %s, %d, %c",
                id, password, name, age, gender);
    }
}
