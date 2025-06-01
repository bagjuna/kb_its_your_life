package ch16.sec04

class Person {
    fun action(calculable: Calculable) {
        val result = calculable.calc(10, 4.0)
        println("결과: $result")
    }
}