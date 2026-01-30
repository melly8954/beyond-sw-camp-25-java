package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.SmartPhone;
import com.beyond.polymorphism.practice.Television;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 1. 부모 타입의 참조 변수로 부모 객체를 다루는 경우
        Product product = new Product();

        // product 참조 변수로 Product 클래스의 멤버만 접근 가능
        System.out.println(product);
        System.out.println();


        // 2. 자식 타입의 참조 변수로 자식 객체를 다루는 경우
        Desktop desktop = new Desktop(
                "a111", "아이맥 24인치", "애플", 1200000, false
        );

        // desktop 참조 변수로 Product, Desktop 클래스의 멤버 모두 접근 가능
        System.out.println(desktop);
        System.out.println();


        // 3. 부모 타입의 참조 변수로 자식 타입의 객체를 다루는 경우 (업캐스팅)
        // Product television = (Product) new Television();
        Product television = new Television(
                "a222", "벽걸이 TV", "LG", 2000000, 50
        );

        // television 참조 변수로 Product 클래스의 멤버만 접근 가능하다.
        // 단, 자식 클래스에서 메서드가 오버라이딩 되었다면 자식 클래스의 메서드가 호출된다.
        // 아래는 Television 의 toString() 메서드가 오버라이딩되어 호출됨
        System.out.println(television);
        System.out.println();

        // 다시 Television 클래스의 멤버에 접근하려면 형 변환(다운 캐스팅)을 해야한다.
        System.out.println( ((Television) television).getInch() );
        System.out.println();


        // 4. 배열과 다형성
        // 4-1). 다형성을 적용하기 전
        Desktop[] desktops = new Desktop[2];
        desktops[0] = new Desktop("a1111", "아이맥 24인치", "애플", 1200000, true);
        desktops[1] = new Desktop("a2222", "맥미니", "애플", 800000, false);

        SmartPhone[] smartPhones = {
                new SmartPhone("a3333", "아이폰15", "애플", 1000000, "KT"),
                new SmartPhone("a4444", "아이폰17", "애플", 1200000, "SKT")
        };

        // 4-2). 다형성을 적용한 후
        Product[] products = {
                new Desktop("a1111", "아이맥 24인치", "애플", 1200000, true),
                new Desktop("a2222", "맥미니", "애플", 800000, false),
                new SmartPhone("a3333", "아이폰15", "애플", 1000000, "KT"),
                new SmartPhone("a4444", "아이폰17", "애플", 1200000, "SKT"),
                new Television("a5555", "벽걸이 TV", "삼성", 2500000, 50)
        };

        for(Product p : products) {
            System.out.println(p);

            // 부모 클래스 타입 참조 변수가 실제로 참조하는 객체를 확인하지 않고
            // 강제 형 변환을 시도하면 ClassCastException 예외가 발생할 수 있다.
            // System.out.println(((Desktop) p).isAllInOne());

            if(p instanceof Desktop) {
                System.out.println(((Desktop) p).isAllInOne());
            } else if(p instanceof SmartPhone) {
                System.out.println(((SmartPhone) p).getMobileAgency());
            } else if(p instanceof Television) {
                System.out.println(((Television) p).getInch());
            }
            System.out.println();
        }
        System.out.println();
        
        // 5. 매개변수와 다형성
        productInfo(new Desktop());
        productInfo(new Television());
        productInfo(new SmartPhone());
    }

    // 다형성을 사용하지 않은다면 오버로딩으로 메서드를 관리해야함
//    public static void productInfo(Desktop desktop) {
//        System.out.println(desktop);
//    }
//
//    public static void productInfo(SmartPhone smartPhone) {
//        System.out.println(smartPhone);
//    }
//
//    public static void productInfo(Television television) {
//        System.out.println(television);
//    }

    // 하지만, 다형성을 사용한다면 하나의 메서드로 관리가 된다.
    public static void productInfo(Product product) {
        System.out.println(product);
    }

}
