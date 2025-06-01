package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    // null 값을 전달하면 NullPointerException 발생
    public static void printLength(String data) {
        int result = 0;
        try {
            result = data.length();
        }catch (NullPointerException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

