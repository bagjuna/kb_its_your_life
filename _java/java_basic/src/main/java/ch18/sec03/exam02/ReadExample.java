package ch18.sec03.exam02;

import java.io.FileInputStream;

public class ReadExample {
    public static void main(String[] args) {
        byte[] data;
        try(FileInputStream fis = new FileInputStream("src/main/java/ch18/test2.db")) {
            data = new byte[4];
            int readByteCount = fis.read(data);
            System.out.println("읽은 바이트 수: " + readByteCount);
            for (byte b : data) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}