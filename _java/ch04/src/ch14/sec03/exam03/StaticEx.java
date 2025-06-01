package ch14.sec03.exam03;

public class StaticEx {
    public static void main(String[] args) {
        // static 필드 호출
        Counter counter = new Counter();
        System.out.println("현재 카운트: " + Counter.count);  // 0
        // static 메서드 호출
        Counter.increment(); // 카운트 증가
        System.out.println("현재 카운트: " + Counter.count);  // 1
        counter.increment();
        System.out.println("현재 카운트: " + Counter.count);  // 2

        // static 클래스 사용
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display(); // hello
        // static 클래스의 인스턴스 생성
    }
}
