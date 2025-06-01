package ch18.sec10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// 앞에서 저장한 "c:/temp/object.dat" 파일을 읽어 각 객체를 역직렬화로 복원하여, 화면에 출력하
//세요(toString 이용)
public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/ch18/object.dat"));
        byte[] buffer = new byte[1024];
        int bytesRead;
        StringBuilder sb = new StringBuilder();
        while ((bytesRead = bis.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, bytesRead));
        }
        bis.close();
        String data = sb.toString();
        System.out.println("Data read from file: " + data);
        // Deserialize the data



        // You can also use ObjectInputStream to deserialize objects directly
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/ch18/object.dat"));
//        Member member = (Member) ois.readObject();
//        Product product = (Product) ois.readObject();
//        System.out.println("Deserialized Member: " + member);
//        System.out.println("Deserialized Product: " + product);
//        ois.close();
    }
}