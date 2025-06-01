package adapter.adapter1;

public class Main {
    public static void main(String[] args) {
        print(new PrintBanner("Hello adapter.adapter1.Banner!"));
    }

    public static void print(Print p) {
        p.printWeak();
        p.printStrong();
    }

}
