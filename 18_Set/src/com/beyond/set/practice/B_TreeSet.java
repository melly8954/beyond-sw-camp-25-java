package com.beyond.set.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class B_TreeSet {
    public void method01() {
        // TreeSet - 이진 트리 구조
        TreeSet<String> set = new TreeSet<>();

        set.add("하하하");
        set.add("나나나");
        set.add("가가가");
        set.add("다다다");
        set.add("다다다");
        set.add("하하하");
        // set.add(null)  -> 에러: null 저장 불가

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println();

        // TreeSet 클래스에서만 제공하는 메서드
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println();
    }


    public void method02() {
        // Set<Music> musicSet = new TreeSet<>();
        Set<Music> musicSet = new TreeSet<>((Music music1, Music music2)
                -> music1.getTitle().compareTo(music2.getTitle())
        );

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
