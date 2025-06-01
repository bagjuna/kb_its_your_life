package ch09.sec06.exam01;

public class Button {
    //정적 멤버 인터페이스
    static interface ClickListener {
        void onClick();
    }

    //인스턴스 필드
    ClickListener listener;

    //인스턴스 메소드
    void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    //인스턴스 메소드
    void touch() {
        listener.onClick();
    }
}