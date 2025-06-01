package ch18.sec10;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

// 다음 데이터를 직렬화를 이용해 src/main/java/ch18/object.dat
// " 파일로 저장하세요
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = {1, 2, 3};
        String str1 = "Hello, World!";
        String str2 = "안녕하세요!";
        String str3 = "こんにちは！";
        String str4 = "你好！";
        String str5 = "안녕하세요! こんにちは！ 你好！";

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/ch18/object.dat"));
        bos.write(m1.toString().getBytes());
        bos.write(p1.toString().getBytes());
        bos.write(str1.getBytes());
        bos.write(String.valueOf(arr1).getBytes());
        bos.flush();
        bos.close();


    }
}