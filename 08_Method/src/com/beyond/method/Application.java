package com.beyond.method;

import com.beyond.method.practice.A_Method;
import com.beyond.method.practice.User;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 1. 매개 변수와 반환값이 없는 메서드 호출
        A_Method a = new A_Method();
        a.method01();
        System.out.println();

        // 2. 매개 변수가 없고 반환값이 있는 메서드 호출
        String msg = a.method02();
        System.out.println(msg);

        // 3. 매개 변수가 있고 반환값이 없는 메서드 호출
        a.method03(10,20);

        // 4. 매개 변수가 있고 반환값이 있는 메서드 호출
        int n = 20;
        int pow = a.method04(n);
        System.out.printf("%d X %d = %d\n", n, n, pow);
        System.out.println();

        // 5. 매개 변수로 객체를 전달받는 메서드 호출
        User user = new User("hong", "1234", "홍길동");
        System.out.println(user.information());
        a.method05(user);
        System.out.println(user.information());
        System.out.println();

        // 6. 매개 변수로 가변 인자를 전달받는 메서드 호출
        // 6-1). 배열을 사용한 가변 인자 방식
//        int[] numbers = {}; // 매개 변수에 배열을 사용할 경우 new 배열타입[] {} 형태로 사용해야한다.
//
//        System.out.println(a.method06(new int[] {}));
//        System.out.println(a.method06(new int[] {1, 2}));
//        System.out.println(a.method06(new int[] {1, 2, 3, 4, 5}));

        // 6-2). ... 형식의 가변인자
        System.out.println(a.method06());
        System.out.println(a.method06(1, 2));
        System.out.println(a.method06(1, 2, 3, 4, 5));
    }
}
