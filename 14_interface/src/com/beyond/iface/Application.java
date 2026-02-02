package com.beyond.iface;

import com.beyond.iface.practice.Basic;
import com.beyond.iface.practice.Desktop;
import com.beyond.iface.practice.SmartPhone;
import com.beyond.iface.practice.Television;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 인터페이스는 객체 생성이 불가능하다.
        // Basic basic = new Basic(); >> 에러

        // 인터페이스는 참조 변수로 사용이 가능하다.
        // 즉, 다형성을 적용해서 인터페이스를 구현하는 객체(구현체)를 참조할 수 있다.
        Basic basic = new SmartPhone(
                "a111", "아이폰 15 프로", "애플", 1200000, "KT"
        );

        basic = new Television(
                "a222", "벽걸이 TV", "LG", 1500000, 50
        );

        basic.turnOn();
        basic.turnOff();
        System.out.println();

        Basic[] products = {
                new Desktop(),
                new SmartPhone(),
                new Television()
        };

        for(Basic product : products) {
            product.turnOn();
            System.out.println(product);
            product.turnOff();
            System.out.println();
        }
    }
}
