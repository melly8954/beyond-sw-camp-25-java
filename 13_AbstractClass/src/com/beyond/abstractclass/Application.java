package com.beyond.abstractclass;

import com.beyond.abstractclass.practice.BasketBall;
import com.beyond.abstractclass.practice.FootBall;
import com.beyond.abstractclass.practice.Sports;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 추상 클래스는 객체 생성이 불가능하다.
        // Sports s = new Sports();

        // 추상 클래스는 참조 변수로 사용이 가능하다.
        // 즉, 다형성을 적용해서 자식 객체를 참조할 수 있다.
        Sports basketBall = new BasketBall(5);
        Sports footBall = new FootBall(11);

        Sports[] sports = {
                basketBall,
                footBall
        };

        for(Sports s : sports){
            s.rule();
        }
    }
    
}
