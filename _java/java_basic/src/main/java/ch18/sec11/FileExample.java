package ch18.sec11;

import java.io.*;

/**
 * ○ src/main/java/ch18/test1.txt 파일을 읽어와서
 * 존재하는지 확인하세요.
 * ○ 존재하는 경우 파일인지, 디렉토리인지 구분함
 *  파일이면 파일경로, 파일 크기를 출력하세요.
 *  디렉토리이면 "<dir> 파일 경로" 형태로 출력하세요.
 * ○ 존재하지 않는 경우, "해당 파일은 없는 파일입니다." 출력함
 */
public class FileExample {
    public static void main(String[] args) {

        String filePath = "src/main/java/ch18/test1.txt";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("파일 경로: " + file.getAbsolutePath());
                System.out.println("파일 크기: " + file.length() + " bytes");
            } else if (file.isDirectory()) {
                System.out.println("<dir> " + file.getAbsolutePath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}