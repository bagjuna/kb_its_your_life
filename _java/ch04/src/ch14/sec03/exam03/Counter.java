package ch14.sec03.exam03;

public class Counter {
    // static 필드 - 모든 인스턴스가 공유
     static int count = 0;

    
     static void increment() {
        count++;
    }

    public static void main(String[] args) {
        // static 필드 호출
        Counter counter = new Counter();
        System.out.println("현재 카운트: " + Counter.count);  // 0
        // static 메서드 호출
        Counter.increment(); // 카운트 증가
        System.out.println("현재 카운트: " + Counter.count);  // 1
        counter.increment();
        System.out.println("현재 카운트: " + Counter.count);  // 2

    }
}
