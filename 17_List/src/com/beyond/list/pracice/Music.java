package com.beyond.list.pracice;

public class Music implements Comparable<Music>{
    private String title;
    private String artist;
    private int ranking;

    public Music(String title, String author, int ranking) {
        this.title = title;
        this.artist = author;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", author='" + artist + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    /*
        compareTo(...)
            - 메서드에서 반환되는 값을 가지고 정렬 기준을 잡는다.
            - 자신과 매개값으로 전달되는 객체가 같으면 0을 리턴한다.
            - 자신이 매개값으로 전달되는 객체보다 크다면 양의 정수를 리턴한다.
            - 자신이 매개값으로 전달되는 객체보다 작다면 음의 정수를 리턴한다.
     */
    @Override
    public int compareTo(Music music) {
        System.out.printf("this.ranking = %d, music.ranking = %d\n", this.ranking, music.ranking);
        // 오름차순 정렬
        return this.ranking - music.ranking;    // 양의 정수

        // 내림차순 정렬
        // return music.ranking - this.ranking; // 음의 정수
    }
}
