package com.beyond.list.pracice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        // [banana, apple, orange, kiwi, grape]
        System.out.println(numbers);
        // [8, 1, 7, 10, 3, 2]
        System.out.println();

        // List 오름차순 정렬
        // 주의: List의 상위 인터페이스 Collection과 혼동할 수 있음
        // Collections.sort(fruits) 메서드에 구현된 내용 사용한다면 다음과 같다.
        // 물론, list.sort(null); 형태로 사용도 가능하다.
        // ex). fruits.sort(null);
        Collections.sort(fruits);
        Collections.sort(numbers);

        System.out.println(fruits);
        // [apple, banana, grape, kiwi, orange]
        System.out.println(numbers);
        // [1, 2, 3, 7, 8, 10]
        System.out.println();

        // List 내림차순 정렬
        // 1. reverse() 메서드
        // 오름차순으로 정렬 후 reverse()를 사용한다.
//        Collections.reverse(fruits);
//        Collections.reverse(numbers);

        // 2. Collections.sort(list, Collections.reverseOrder()) 메서드 사용
        Collections.sort(fruits, Collections.reverseOrder());
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println(fruits);
        // [orange, kiwi, grape, banana, apple]
        System.out.println(numbers);
        // [10, 8, 7, 3, 2, 1]
        System.out.println();
    }

    public void method03() {
        List<Music> musicList = new ArrayList<>();

        musicList.add(new Music("404 (New Era)", "키키", 4));
        musicList.add(new Music("그대 작은 나의 세상이 되어", "카더가든", 2));
        musicList.add(new Music("사랑하게 될 거야", "한로로", 6));
        musicList.add(new Music("FOCUS", "Hearts2Heart", 3));
        musicList.add(new Music("Love Love Love", "에픽하이", 1));
        musicList.add(new Music("Good GoodBye", "화사", 5));

        for(Music music : musicList) {
            System.out.println(music);
//            Music{title='404 (New Era)', author='키키', ranking=4}
//            Music{title='그대 작은 나의 세상이 되어', author='카더가든', ranking=2}
//            Music{title='사랑하게 될 거야', author='한로로', ranking=6}
//            Music{title='FOCUS', author='Hearts2Heart', ranking=3}
//            Music{title='Love Love Love', author='에픽하이', ranking=1}
//            Music{title='Good GoodBye', author='화사', ranking=5}
        }
        System.out.println();

        // 오름차순으로 리스트 정렬(랭킹순)
        // String or Integer 등은 이미 클래스 내 Comparable 인터페이스가 구현되어 있음
        Collections.sort(musicList);

        for(Music music : musicList) {
            System.out.println(music);
//            Music{title='Love Love Love', author='에픽하이', ranking=1}
//            Music{title='그대 작은 나의 세상이 되어', author='카더가든', ranking=2}
//            Music{title='FOCUS', author='Hearts2Heart', ranking=3}
//            Music{title='404 (New Era)', author='키키', ranking=4}
//            Music{title='Good GoodBye', author='화사', ranking=5}
//            Music{title='사랑하게 될 거야', author='한로로', ranking=6}
        }

        System.out.println();

        // 오름차순으로 리스트 정렬(아티스트순으로 정렬)
        // 기존의 랭킹순 정렬은 그대로 두고 아티스트 정렬을 사용할 경우
        Collections.sort(musicList, new ArtistAscending());

        for(Music music : musicList) {
            System.out.println(music);
        }

        System.out.println();

        // 오름차순으로 리스트 정렬 (타이틀순으로 정렬)
        // 1. 익명 구현 객체
        // 기존에는 인터페이스를 객체로 생성할 수 없음(구현 클래스를 이용)
        // 해당 방법은 익명 클래스를 만들어서 활용
//        Collections.sort(musicList, new Comparator<Music>() {
//            @Override
//            public int compare(Music music1, Music music2) {
//                return music1.getTitle().compareTo(music2.getTitle());
//            }
//        });

        // 2. 람다식
        Collections.sort(musicList, (Music music1, Music music2)
                -> music1.getTitle().compareTo(music2.getTitle())
        );

        for(Music music : musicList) {
            System.out.println(music);
        }

        System.out.println();
    }
}
