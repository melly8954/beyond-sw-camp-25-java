package com.beyond.api.practice;

/*
    Wrapper 클래스
        - 기본 자료형을 객체로 포장해 주는 클래스이다.
        - 프로그램에 따라서 기본 타입을 객체로 취급해서 처리해야 하는 경우에 사용한다.
        - 기본 자료형을 Wrapper 클래스로 포장해 주는 것을 Boxing이라고 한다.
        - 반대로, Wrapper 클래스를 기본 자료형으로 변경해 주는 것을 Unboxing이라고 한다.
 */
public class B_Wrapper {
    // Boxing, Unboxing 테스트
    public void method01() {
        // 1. Boxing(기본 타입 -> Wrapper 타입)
        // 1-1). Wrapper 클래스로 객체를 직접 생성하는 방법이다. (@Deprecated)
//        Integer i = new Integer(10);
//        Double d = new Double(3.14);
//        Character c = new Character('a');

        // 1-2). Wrapper 클래스의 정적 메서드를 통해서 객체를 생성하는 방법
        // 오토박싱이 가능해서 warning이 나오는것
//        Integer i = Integer.valueOf(10);
//        Double d1 = Double.valueOf(3.14);
//        Double d2 = Double.valueOf("3.14");
//        Character c = Character.valueOf('a');

        // 1-3). Auto Boxing 처리
        Integer i = 10;
        Double d1 = 3.14;
        // 문자열을 Double로 처리 시 정적 메서드를 사용, 이 경우 AutoBoxing은 아님
        Double d2 = Double.valueOf("3.14");
        Character c = 'a';

        System.out.println(i);  // 10
        System.out.println(d1); // 3.14
        System.out.println(d2); // 3.14
        System.out.println(c);  // 'a'
        System.out.println();

        // 클래스에서 제공하는 메서드들을 사용할 수 있다.
        System.out.println(d1 == d2);   // false (참조 비교라 false)
        System.out.println(d1.equals(d2));  // true
        System.out.println();


        // 2. Unboxing (Wrapper 타입 -> 기본 타입)
        // 2-1). Wrapper 객체의 메서드를 이용하는 방법
//        int number = i.intValue();
//        double dNumber1 = d1.doubleValue();
//        double dNumber2 = d2.doubleValue();
//        char ch = c.charValue();

        // 2-2). Auto Unboxing
        int number = i;
        double dNumber1 = d1;
        double dNumber2 = d2;
        char ch = c;

        System.out.println(number);     // 10
        System.out.println(dNumber1);   // 3.14
        System.out.println(dNumber2);   // 3.14
        System.out.println(ch);         // 'a'
        System.out.println(dNumber1 == dNumber2);   // true
        System.out.println();
    }

    // String과 Wrapper 클래스 타입 변경
    public void method02() {
        // 1. 문자열을 기본 자료형으로 변환
        int number = Integer.parseInt("10");
        double dNumber1 = Double.parseDouble("3.141592");
        double dNumber2 = Double.parseDouble("3");

        System.out.println(number);     // 10
        System.out.println(dNumber1);   // 3.141592
        System.out.println(dNumber2);   // 3.0
        System.out.println(dNumber1 + dNumber2);    // 6.141592
        System.out.println();

        // 2. 기본 자료형을 문자열로 변환
        // 2-1). String.valueOf() 정적 메서드 사용
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);

        System.out.println(str1);   // "10"
        System.out.println(str2);   // "3.14"
        System.out.println(str1 + str2);    // "103.14"
        System.out.println();

        // 2-2). Wrapper 클래스의 valueOf() 메서드 사용
        String str3 = Integer.valueOf(10).toString();
        String str4 = Double.valueOf(3.14).toString();

        System.out.println(str3);   // "10"
        System.out.println(str4);   // "3.14"
        System.out.println(str1 + str2);    // "103.14"
        System.out.println();
    }
}
