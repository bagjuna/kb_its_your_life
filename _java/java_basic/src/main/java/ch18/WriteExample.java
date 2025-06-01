package ch18;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("src/main/java/ch18/test.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            byte a = 10;
            byte b = 20;
            byte c = 30;

            System.out.println("Enter a number: ");
            bw.write(String.valueOf(a));
            bw.write(String.valueOf(b));
            bw.write(String.valueOf(c));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            InputStream is = new FileInputStream("src/main/java/ch18/test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int a = 0;
            while ((a = br.read()) != -1) {
                bw.write(a);
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
