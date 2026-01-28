package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // Phone 클래스는 접근 제한이 default인 클래스로 패키지 외부에서 접근이 불가능하다.
        // Phone phone = new Phone();

        Person p1 = new Person();
        p1.setName("홍길동");
        p1.setAge(29);
        p1.setPhone("아이폰 15 프로", "네츄럴 티타늄 ", "애플");
        p1.introduce();


        Person p2 = new Person();
        p2.setName("이몽룡");
        p2.setAge(27);
        p2.setPhone("아이폰 17 에어", "화이트", "애플");
        p2.introduce();
    }
}
