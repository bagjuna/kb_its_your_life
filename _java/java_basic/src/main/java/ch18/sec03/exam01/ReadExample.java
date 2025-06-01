package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/main/java/ch18/test1.db")) {

            int data;

            while ((data = fis.read()) != -1) {
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}