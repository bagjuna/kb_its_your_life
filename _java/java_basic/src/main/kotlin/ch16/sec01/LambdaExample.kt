package ch16.sec01

object LambdaExample {
    @JvmStatic
    fun main(args: Array<String>) {
        // x + y 계산
        // x – y 계산
    }

    fun action(calculable: Calculable) {
        //데이터
        val x = 10
        val y = 4
        //데이터 처리
        calculable.calculate(x, y)
    }
}