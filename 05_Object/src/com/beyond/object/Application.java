package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        Person p1 = new Person();
        p1.setName("홍길동");
        p1.setAge(29);
        p1.introduce();
        System.out.println();

        Person p2 = new Person();
        p2.setName("이몽룡");
        p2.setAge(27);
        p2.introduce();
    }
}
