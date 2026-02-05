package com.beyond.assiststream.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
    public void fileSaveAndRead() {
        try (DataOutputStream dos = new DataOutputStream( new FileOutputStream("b_data.txt"));
             DataInputStream dis = new DataInputStream(new FileInputStream("b_data.txt"))) {

            // 파일에 데이터 출력하기
            dos.writeUTF("홍길동");
            dos.writeInt(34);
            dos.writeDouble(175.8);
            dos.writeChar('남');
            dos.writeBoolean(false);

            // 파일에서 데이터 읽어오기
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
