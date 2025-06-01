package adapter.adapter1;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen(); // 부모 클래스의 메서드 호출
    }

    @Override
    public void printStrong() {
        showWithAster(); // 부모 클래스의 메서드 호출
    }



}
