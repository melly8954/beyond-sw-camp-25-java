package com.beyond.assiststream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {
    // InputStreamReader 테스트
    public void method01() {
        try {
            // 여러 개의 보조 스트림을 연걸해서 사용 가능하다.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;

            System.out.print("문자열 입력 > ");
            line = br.readLine();

            System.out.print(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // OutputStreamWriter 테스트
    public void method02() {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write("안녕하세여 저는 몽룡이예요");
            bw.newLine();
            bw.write("만나서 반갑소. 이따 다시 봐요");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
