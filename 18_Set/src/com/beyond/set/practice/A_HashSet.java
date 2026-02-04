package com.beyond.set.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class A_HashSet {
    public void method01() {
        Set<String> set = new HashSet<>();
        // LinkedHashSet() 은 저장한 순서를 기억하고 출력한다.

        set.add(null);
        set.add("반갑습니다.");
        set.add(new String("반갑습니다."));
        set.add("여러분");
        set.add("안녕하세요.");
        set.add("여러분");
        set.add(null);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println();

        // Set에 저장된 객체에 접근하는 방법
        // 1. 향상된 for문을 사용하는 방법
        for(String str : set) {
            System.out.println(str);
        }
        System.out.println();

        // 2. Iterator 반복자를 사용하는 방법
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // 3. 람다식, 메서드 참조 활용
        // set.forEach(s -> System.out.println(s));
        // set.forEach(System.out::println);(
    }

    public void method02() {
        Set<Music> musicSet = new HashSet<>();

        // HashSet은 hashCode(), equals() 메서드를 오버라이딩 하지 않으면 중복이 제거되지 않는다.
        musicSet.add(new Music("404 (New Era)", "키키", 4));
        musicSet.add(new Music("404 (New Era)", "키키", 4));
        musicSet.add(new Music("그대 작은 나의 세상이 되어", "카더가든", 2));
        musicSet.add(new Music("그대 작은 나의 세상이 되어", "카더가든", 2));
        musicSet.add(new Music("사랑하게 될 거야", "한로로", 6));
        musicSet.add(new Music("FOCUS", "Hearts2Heart", 3));
        musicSet.add(new Music("FOCUS", "Hearts2Heart", 3));
        musicSet.add(new Music("Love Love Love", "에픽하이", 1));
        musicSet.add(new Music("Good GoodBye", "화사", 5));

        for(Music music : musicSet) {
            System.out.println(music);
        }
        System.out.println();
    }
}
