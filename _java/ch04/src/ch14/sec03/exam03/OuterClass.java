package ch14.sec03.exam03;

// OuterClass.java
public class OuterClass {
    // 정적 중첩 클래스 정의
    public static class StaticNestedClass {
        private String message = "hello";
        
        public void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        // 정적 중첩 클래스의 인스턴스 생성
        StaticNestedClass nested = new StaticNestedClass(); // 정적 중첩 클래스는 OuterClass의 인스턴스 없이 생성 가능
        StaticNestedClass nested2 = new StaticNestedClass(); // 서로 다른 인스턴스
        nested.message = "no hello"; // private 필드에 접근 가능
        nested.display(); // no hello
        nested2.display(); // hello
    }
}
