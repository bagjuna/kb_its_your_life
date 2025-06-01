package adapter.adapter2;


public class Main {
    public static void main(String[] args) {
        print(new PrintBanner("Hello Hello"));
    }

    public static void print(Print p) {
        p.printWeak();
        p.printStrong();
    }


}
