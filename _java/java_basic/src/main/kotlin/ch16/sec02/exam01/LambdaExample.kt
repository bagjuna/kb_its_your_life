package ch16.sec02.exam01

object LambdaExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val person = Person()
        //실행문이 두 개 이상인 경우 중괄호 필요
        person.action {
            println("출근합니다.")
            println("프로그래밍을 합니다.")
        }
        //실행문이 한 개일 경우 중괄호 생략 가능
        person.action { println("퇴근합니다.") }
    }
}