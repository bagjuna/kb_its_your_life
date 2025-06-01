
package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //매개변수가 두 개일 경우
        //홍길동이 프로그래밍을 합니다.
        person.action1(
                (name, job) -> {
                    System.out.println(name + "님이 " + job + "을 합니다.");
                }
        );
        //홍길동이 프로그래밍을 하지 않습니다.
        person.action1(
                (name, job) -> System.out.println(name + "님이 " + job + "을 하지 않습니다.")
        );
        //매개변수가 한 개일 경우

        //"안녕하세요"라고 말합니다.
        person.action2(
                (message) -> System.out.println(message + "라고 말합니다.")
        );
        //"안녕하세요"라고 외칩니다.
        person.action2(
                (message) -> System.out.println(message + "라고 외칩니다.")
        );
    }
}