
package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = {10, 20, 30};
        // 다음 변수의 값을 "test2.db" 파일에 저장하세요.
        // 1. FileOutputStream을 사용하여 파일에 바이트를 저장하는 방법
        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/ch18/test2.db");
            fos.write(array);
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}