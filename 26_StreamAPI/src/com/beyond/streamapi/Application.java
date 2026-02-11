package com.beyond.streamapi;

import com.beyond.streamapi.practice.A_Stream;
import com.beyond.streamapi.practice.B_Filtering;
import com.beyond.streamapi.practice.C_Sort;
import com.beyond.streamapi.practice.D_Mapping;
import com.beyond.streamapi.practice.E_Match;
import com.beyond.streamapi.practice.F_Aggregate;
import com.beyond.streamapi.practice.G_Collect;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 스트림 생성
//        new A_Stream().method01();
//        new A_Stream().method02();
//        new A_Stream().method03();

        // 중간 처리 메서드
//        new B_Filtering().method01();
//        new B_Filtering().method02();

        // 중간 처리 메서드 (정렬)
//        new C_Sort().method01();
//        new C_Sort().method02();

        // 중간 처리 메서드(매핑)
//        new D_Mapping().method01();
//        new D_Mapping().method02();

        // 최종 처리 메서드
//        new E_Match().method01();
//        new E_Match().method02();

//        new F_Aggregate().method01();

        new G_Collect().method01();
    }
}
