package com.beyond.list.pracice;

import java.util.Comparator;

public class ArtistAscending implements Comparator<Music> {
    /*
        compare(...)
            - 메서드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
            - 매개값으로 전달된 두 객체가 같으면 0을 리턴한다.
            - 첫 번째 객체(music1)가 크다면 양의 정수를 리턴한다.
            - 첫 번째 객체(music2)가 작다면 음의 정수를 리턴한다.
     */
    @Override
    public int compare(Music music1, Music music2) {
        return music1.getArtist().compareTo(music2.getArtist());
    }
}
