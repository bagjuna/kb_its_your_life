package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};
        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("인덱스 초과: " + e.getMessage());
            } catch (NullPointerException e) {
                System.err.println("null 값: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("숫자 변환 오류: " + e.getMessage());
            }
        }
    }
}