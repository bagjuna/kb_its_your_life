package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 타입 변수 선언
        RemoteControl rc;

        // Television 객체 생성
        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        // Audio 객체 생성
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
    }
}
