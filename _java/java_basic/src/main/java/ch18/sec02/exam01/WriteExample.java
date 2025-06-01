package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = 30;
        // 다음 변수의 값을 "test1.db" 파일에 저장하세요.
        // 1. FileOutputStream을 사용하여 파일에 바이트를 저장하는 방법
        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/ch18/test1.db");
            fos.write(a);
            fos.write(b);
            fos.write(c);
            fos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}