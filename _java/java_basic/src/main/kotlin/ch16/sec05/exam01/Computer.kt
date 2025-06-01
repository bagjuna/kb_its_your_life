package ch16.sec05.exam01

class Computer {
    fun instanceMethod(x: Double, y: Double): Double {
        return x * y
    }

    companion object {
        @JvmStatic
        fun staticMethod(x: Double, y: Double): Double {
            return x + y
        }
    }
}