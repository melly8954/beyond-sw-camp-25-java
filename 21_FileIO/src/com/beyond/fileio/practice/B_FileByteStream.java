package com.beyond.fileio.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class B_FileByteStream {
    public void fileSave() {
        FileOutputStream fos = null;
        byte[] values = {97, 98, 99, 100, 101};

        try {
            // 기존 파일이 있는 경우, 파일을 덮어씌운다.
            // 단, true 속성을 통해서 이어쓸지 덮어쓸지 결정할 수 있다.
            fos = new FileOutputStream("a_byte.dat");
            // fos = new FileOutputStream("a_byte.dat", true);

            fos.write(97);
            fos.write('b');
            fos.write(10);  // 줄 바꿈 문자
            fos.write('c');
            fos.write(10);
            fos.write(10);

            // 자바에서 한글은 2byte로 표현되기 때문에 바이트 단위 스트림으로는 출력할 수 없다.
            fos.write('한');
            fos.write(10);
            fos.write(10);

            fos.write(values);
            fos.write(10);
            fos.write(values,1,2);
            fos.write(10);

            fos.flush();

            // write() 메서드에서 예외가 발생하면 close() 메서드는 실행되지 않는다.
            // 따라서, finally 블록에서 close() 메서드를 호출해야 한다.
            // fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileRead() {
        FileInputStream fis = null;
        byte[] buffer = new byte[50];

        try {
            // 파일이 존재하지 않는 경우 FileNotFoundException 예외 발생
            fis = new FileInputStream("a_byte.dat");

//            System.out.println(fis.read());
//            System.out.println(fis.read());
//            System.out.println(fis.read());

//            System.out.print((char) fis.read());  // a
//            System.out.print((char) fis.read());  // b
//            System.out.print((char) fis.read());  // \n

//            System.out.println(fis.read(buffer));
//            System.out.println(fis.read(buffer, 10, 5));
//            System.out.println(Arrays.toString(buffer));

            // read() 메서드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
            int value;

            while ((value = fis.read()) != -1) {
                System.out.print((char) value);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
