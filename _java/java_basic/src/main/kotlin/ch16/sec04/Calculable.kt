package ch16.sec04

fun interface Calculable {
    fun calc(x: Double, y: Double): Double
    fun calc(x: Int, y: Double): Double {
        return 3.14
    }
}