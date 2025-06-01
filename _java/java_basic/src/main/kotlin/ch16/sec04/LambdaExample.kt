package ch16.sec04

object LambdaExample {
    @JvmStatic
    fun main(args: Array<String>) {
        val person = Person()
        //실행문이 두 개 이상일 경우
        person.action { x: Double, y: Double ->
            print("")
            x + y
        }
        // sum() 메서드를 호출
        person.action { x: Double, y: Double -> sum(x, y) }
    }

    @JvmStatic
    fun sum(x: Double, y: Double): Double {
        return (x + y)
    }
}