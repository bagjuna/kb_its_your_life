
package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "src/main/java/ch18/test1.png";
        String targetFileName = "src/main/java/ch18/test2.png";
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName);


        byte[] buffer = new byte[1024]; // 1KB 버퍼
        int bytesRead;

        while ((bytesRead = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }

        // 스트림 닫기
        os.close();
        is.close();

        System.out.println("복사가 완료되었습니다.");
    }
}