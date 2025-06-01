package ch14.sec03.exam03;

class Outer {
    static class StaticInner {
        int num = 10;
    }

    static int staticValue = 100;

    static void staticMethod() {
        System.out.println("Static Method 호출");
    }

    void instanceMethod() {
        System.out.println("Instance Method 호출");
    }

    int instanceValue = 200;
}