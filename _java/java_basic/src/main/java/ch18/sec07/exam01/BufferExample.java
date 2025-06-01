package ch18.sec07.exam01;

/**
 * 다음 파일을 복사하고, 복사하는데 걸린 시간을 화면에 출력하세요.
 * ○ 스트림은 성능 향상 보조 스트림을 사용함
 * ○ 원본 파일은 src/main/java/ch18/originalFile1.png
 * ○ 복사 파일은 src/main/java/ch18/originalFile2.png
 */

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {

        // 원본 파일 경로
        String originalFilePath = "src/main/java/ch18/originalFile1.png";
        // 복사 파일 경로
        String copyFilePath = "src/main/java/ch18/originalFile2.jpg";

        // 성능 향상 보조 스트림을 사용하여 파일 복사
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFilePath))) {

            long startTime = System.currentTimeMillis(); // 시작 시간

            byte[] buffer = new byte[1024]; // 1KB 버퍼
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.currentTimeMillis(); // 종료 시간
            System.out.println("복사 완료! 소요 시간: " + (endTime - startTime) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}