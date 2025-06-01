package proxy;

public interface Printable {
    void setPrinterName(String name); // 이름 설정

    String getPrinterName(); // 이름 취득

    void print(String string); // 문자열 표시(프린트 아웃)
}