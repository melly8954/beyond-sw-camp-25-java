package com.beyond.fileio.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class C_FileCharStream {
    public void fileSave() {
        // try-with-resources 구문을 통해서 사용한 리소스를 자동으로 close() 시킨다.
        try (FileWriter fw = new FileWriter("b_char.txt")) {
            fw.write('A');
            fw.write('\n');
            fw.write('홍');
            fw.write('\n');
            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
            fw.write('\n');
            fw.write(new char[] {'안', '녕', '하', '세', '요', '.'}, 2, 4);
            fw.write('\n');
            fw.write("안녕하세요.\n");
            fw.write("저는 홍길동입니다.\n", 3, 8);

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileRead() {
        char[] buffer = new char[50];

        try (FileReader fr = new FileReader("b_char.txt")) {
//            System.out.print((char) fr.read());
//            System.out.print((char) fr.read());
//            System.out.print((char) fr.read());
//
//            System.out.println(fr.read(buffer, 10, 10));
//            System.out.println(Arrays.toString(buffer));

            //
            int value;

            while((value = fr.read()) != -1) {
                System.out.print((char) value);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
