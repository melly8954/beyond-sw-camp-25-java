package com.beyond.object.practice;

/*
    클래스에서 사용 가능한 접근 제한자
    1. public
        - public으로 선언된 클래스는 아무런 제약없이 사용할 수 있다.
    2. default
        - default로 선언된 클래스는 동일한 패키지에서는 아무런 제약없이 사용할 수 있다.
 */
public class Person {
    // 1. 필드(속성) 정의
    private String name;
    private int age;

    // 2. 생성자 정의
    public Person() {
        System.out.println("생성자 호출");
    }
    
    // 3. 메서드(기능) 정의
    public void setName(String n) {
        name = n;
    }

    public void setAge(int n) {
        age = n;
    }

    public void introduce() {
        System.out.printf("안녕하세요.\n저는 %s이고, 나이는 %d세 입니다.\n", name, age);
    }
}
