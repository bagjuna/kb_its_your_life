package ch18.sec04.exam02;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadExample {
    public static void main(String[] args) {
        byte[] data;
        try {
            FileInputStream fis = new FileInputStream("src/main/java/ch18/test3.db");
            InputStreamReader isr = new InputStreamReader(fis);
            int read = 0;
            long currentTimeMillis = System.currentTimeMillis();

            while ((read = isr.read()) != -1) {
                System.out.print((char) read);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("읽은 바이트 수: " + read);
            System.out.println("시간: " + (endTime - currentTimeMillis) + "ms");
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}