package ch09.sec07.exam02;

public class Home {
    //필드에 익명 구현 객체 대입
    RemoteControl rc = new RemoteControl() {
        //추상 메소드 오버라이딩
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }

    };
    //메소드(필드 이용)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }
    

}