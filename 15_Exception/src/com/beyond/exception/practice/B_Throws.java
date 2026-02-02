package com.beyond.exception.practice;

import java.io.IOException;

public class B_Throws {
    public void method01() throws IOException, ClassNotFoundException {
        System.out.println("method01 실행");

        method02();

        System.out.println("method01 종료");
    }

    private void method02() throws IOException, ClassNotFoundException {
        System.out.println("method02 실행");

        method03();

        System.out.println("method02 종료");
    }

    private void method03() throws ClassNotFoundException, IOException {
        System.out.println("method03 실행");

        // 1부터 3사이의 랜덤 수
        int random = (int) (Math.random() * 3) + 1;

        if(random == 1) {
            throw new ClassNotFoundException();
        } else if(random == 2) {
            throw new IOException();
        }

        System.out.println("method03 종료");
    }
}
