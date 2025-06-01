package adapter.adapter2;


public class PrintBanner extends Print {
    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // 부모 클래스의 메서드 호출
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // 부모 클래스의 메서드 호출
    }


}
