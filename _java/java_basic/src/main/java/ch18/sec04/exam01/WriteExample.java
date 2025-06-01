package ch18.sec04.exam01;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char[] arr = {'C', 'D', 'E'};

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/ch18/test3.db");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            long currentTimeMillis = System.currentTimeMillis();

            bos.write(a);
            bos.write(b);
            for(int i = 0; i<1000000; i++) {
                bos.write(a);
            }

            long endTime = System.currentTimeMillis();
            System.out.println("시간: " + (endTime - currentTimeMillis) + "ms");
            fos.flush();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}