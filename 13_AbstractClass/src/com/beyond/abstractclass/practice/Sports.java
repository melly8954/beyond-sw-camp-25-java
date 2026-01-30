package com.beyond.abstractclass.practice;

public abstract class Sports {
    // 참여하는 사람의 수
    protected int numberOfPlayers;

    public Sports(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    // 추상 메서드
    // 각각의 종목마다 그에 따른 룰을 반드시 재정의 해야 한다.
    public abstract void rule();
}
