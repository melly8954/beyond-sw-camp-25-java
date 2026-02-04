package com.beyond.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A_HashMap {
    public void method01() {
        // 순서를 보장하지 않는다.
        Map<String, Snack> map = new HashMap<>();

        // put() 메서드는 entry 객체를 저장하는 메서드이다.
        // 중복된 key가 존재할 경우 value를 덮어씌운다.
        map.put("다이제", new Snack("다이제", "초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸", "바나나맛", 200));
        map.put("프링글스", new Snack("프링글스", "어니언맛", 400));
        map.put("프링글스", new Snack("프링글스", "오리지널맛", 400));
        map.put("먹태깡", new Snack("먹태깡", "청양마요", 300));

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();

        // get() 메서드는 key에 해당하는 value값을 조회하는 메서드이다.
        Snack snack = map.get("칸쵸");

        System.out.println(snack);
        System.out.println();

        // remove() 메서드는 key에 해당하는 Entry 객체를 제거하는 메서드이다.
        snack = map.remove("먹태깡");

        System.out.println(snack);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();

        // clear 메서드는 모든 Entry 객체를 삭제하는 메서드이다.
        map.clear();

        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println();
    }

    public void method02() {
        Map<String, Snack> map = new HashMap<>();

        map.put("다이제", new Snack("다이제", "초코맛", 1000));
        map.put("칸쵸", new Snack("칸쵸", "바나나맛", 200));
        map.put("프링글스", new Snack("프링글스", "어니언맛", 400));
        map.put("프링글스", new Snack("프링글스", "오리지널맛", 400));
        map.put("먹태깡", new Snack("먹태깡", "청양마요", 300));

        // map은 인덱스가 존재하지 않아서 for 문을 사용할 수 없다.
        // for(int i = 0; i < map.size(); i++) {}

        // Map은 Iterable 인터페이스를 구현하지 않아서 향상된 for문 역시 사용할 수 없다.
        // for(Map.Entry<String,Snack> m : map) {}

        // HashMap에 저장된 객체들을 반복문을 통해서 출력하는 방법
        // 1. keySet() 메서드 사용
        // - Map 컬렉션에 있는 키값들만 Set 컬렉션에 담아서 반환한다.
        Set<String> set = map.keySet();
//        for(String key : set) {
//            System.out.printf("Key: %s, Value: %s\n", key, map.get(key));
//        }
        set.forEach(key -> System.out.printf("Key: %s, Value: %s\n", key, map.get(key)) );

        System.out.println();

        // 2. entrySet() 메서드 사용
        // - Map 컬렉션에 있는 Entry 객체를 Set 컬렉션에 담아서 반환환다.
        Set<Map.Entry<String, Snack>> entries = map.entrySet();

        System.out.println(map);
        System.out.println(entries);
        System.out.println();

        for(Map.Entry<String, Snack> entry : entries) {
            System.out.printf("Key: %s, Value: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
