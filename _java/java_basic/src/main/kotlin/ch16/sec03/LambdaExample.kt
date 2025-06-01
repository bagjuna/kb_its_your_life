package ch16.sec03

object LambdaExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val person = Person()
        //매개변수가 두 개일 경우
        //홍길동이 프로그래밍을 합니다.
//        person.action1 { name: String, job: String -> println(name + "님이 " + job + "을 합니다.") }
        //홍길동이 프로그래밍을 하지 않습니다.
//        person.action1 { name: String, job: String -> println(name + "님이 " + job + "을 하지 않습니다.") }

        //매개변수가 한 개일 경우

        //"안녕하세요"라고 말합니다.
//        person.action2 { message: String -> println(message + "라고 말합니다.") }
        //"안녕하세요"라고 외칩니다.
//        person.action2 { message: String -> println(message + "라고 외칩니다.") }
    }
}