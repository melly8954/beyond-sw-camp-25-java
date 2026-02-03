package com.beyond.list.pracice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class A_ArrayList {
    public void method01() {
        // List 사용
        List list = new ArrayList();

        // 객체를 저장할 때는 add() 메서드를 사용한다.
        // 기본 타입 역시 AutoBoxing되어 객체로 저장된다.
        list.add("안녕하세요");
        list.add(LocalDateTime.now());
        list.add(false);

        // 객체의 중복 저장을 허용한다.
        list.add(3.14);
        list.add(3.14);

        // null 저장을 허용한다.
        list.add(null);
        list.add(null);

        System.out.println(list);

        // 저장되어 있는 전체 객체의 수를 리턴한다.
        System.out.println(list.size());

        // 객체를 가져올 때는 get() 메서드를 사용한다.
        String str = (String) list.get(0);
        LocalDateTime now = (LocalDateTime) list.get(1);
        Boolean b = (Boolean) list.get(2);
        Double d = (Double) list.get(3);

//        System.out.println(str);
//        System.out.println(now);
//        System.out.println(b);
//        System.out.println(d);
//        for(int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();

        // 원하는 인덱스 위치에 객체를 추가할 수 있다.
        list.add(2, 10000);

        // JDK 21버전에서 추가된 메서드
        list.addFirst("AAAAA");
        list.addLast("BBBBB");
        System.out.println(list);
        System.out.println();

        // set() 멕서드는 원하는 인덱스위 위치에 객체를 변경할 때 사용한다.
        list.set(4,true);
        System.out.println(list);
        System.out.println();

        //
        list.remove(3);
        list.remove("안녕하세요");
        // 중복된 객체(값) 제거 시 앞의 인덱스 먼저 제거 된다.
        list.remove(null);

        // JDK 21버전에서 추가된 메서드
        list.removeFirst();
        list.removeLast();

        // 정수형 값 10000을 제거 시 list.remove(10000)은 인덱스로 사용된다.
        // 따라서, 객체(Integer)로 만들어서 제거 해야한다.
        list.remove(Integer.valueOf(10000));

        System.out.println(list);
        System.out.println();

        // List가 비어있는지 확인하는 메서드
        System.out.println(list.isEmpty());     // false
        System.out.println();

        // List에 저장된 객체들을 모두 삭제하는 메서드
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list.isEmpty());     // true
    }

    public void method02() {
        // 컬렉션에서 제네릭스 타입을 사용하는 이유
        // - 명시된 타입의 객체만 저장하도록 제한을 두기 위해서 사용한다.
        // - 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형 변환을 하지 않아도 된다.
        List<String> fruits = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("grape");

        numbers.add(8);
        numbers.add(1);
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);

        System.out.println(fruits);
        System.out.println(numbers);
        System.out.println();
    }
}
