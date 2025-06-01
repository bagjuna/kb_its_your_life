package ch16.sec05.exam01

class Person {
    fun action(calcuable: Calcuable) {
        val result = calcuable.calc(10.0, 4.0)
        println("결과: $result")
    }
}