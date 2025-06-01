package ch08.sec11.test1;

public interface Animal extends Breathable {
    // 인터페이스는 public abstract가 생략되어 있다.
    // public static final이 생략되어 있다.
    default void eat() {
        System.out.println("먹는다.");
    }
    void sleep();

    // 인터페이스는 public static final이 생략되어 있다.
    int a = 10;

    // 인터페이스는 public static final이 생략되어 있다.
    static int b = 20;



}
